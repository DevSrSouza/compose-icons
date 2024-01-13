package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.WeightScale: ImageVector
    get() {
        if (_weightScale != null) {
            return _weightScale!!
        }
        _weightScale = Builder(name = "WeightScale", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 176.0f)
                arcToRelative(128.0f, 128.0f, 0.0f, true, true, 256.0f, 0.0f)
                arcToRelative(128.0f, 128.0f, 0.0f, true, true, -256.0f, 0.0f)
                close()
                moveTo(391.8f, 64.0f)
                curveTo(359.5f, 24.9f, 310.7f, 0.0f, 256.0f, 0.0f)
                reflectiveCurveTo(152.5f, 24.9f, 120.2f, 64.0f)
                horizontalLineTo(64.0f)
                curveTo(28.7f, 64.0f, 0.0f, 92.7f, 0.0f, 128.0f)
                verticalLineTo(448.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                horizontalLineTo(448.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                verticalLineTo(128.0f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                horizontalLineTo(391.8f)
                close()
                moveTo(296.0f, 224.0f)
                curveToRelative(0.0f, -10.6f, -4.1f, -20.2f, -10.9f, -27.4f)
                lineToRelative(33.6f, -78.3f)
                curveToRelative(3.5f, -8.1f, -0.3f, -17.5f, -8.4f, -21.0f)
                reflectiveCurveToRelative(-17.5f, 0.3f, -21.0f, 8.4f)
                lineTo(255.7f, 184.0f)
                curveToRelative(-22.0f, 0.1f, -39.7f, 18.0f, -39.7f, 40.0f)
                curveToRelative(0.0f, 22.1f, 17.9f, 40.0f, 40.0f, 40.0f)
                reflectiveCurveToRelative(40.0f, -17.9f, 40.0f, -40.0f)
                close()
            }
        }
        .build()
        return _weightScale!!
    }

private var _weightScale: ImageVector? = null
