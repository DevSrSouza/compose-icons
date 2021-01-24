package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.GlassMartini: ImageVector
    get() {
        if (_glassMartini != null) {
            return _glassMartini!!
        }
        _glassMartini = Builder(name = "GlassMartini", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(502.05f, 57.6f)
                curveTo(523.3f, 36.34f, 508.25f, 0.0f, 478.2f, 0.0f)
                horizontalLineTo(33.8f)
                curveTo(3.75f, 0.0f, -11.3f, 36.34f, 9.95f, 57.6f)
                lineTo(224.0f, 271.64f)
                verticalLineTo(464.0f)
                horizontalLineToRelative(-56.0f)
                curveToRelative(-22.09f, 0.0f, -40.0f, 17.91f, -40.0f, 40.0f)
                curveToRelative(0.0f, 4.42f, 3.58f, 8.0f, 8.0f, 8.0f)
                horizontalLineToRelative(240.0f)
                curveToRelative(4.42f, 0.0f, 8.0f, -3.58f, 8.0f, -8.0f)
                curveToRelative(0.0f, -22.09f, -17.91f, -40.0f, -40.0f, -40.0f)
                horizontalLineToRelative(-56.0f)
                verticalLineTo(271.64f)
                lineTo(502.05f, 57.6f)
                close()
            }
        }
        .build()
        return _glassMartini!!
    }

private var _glassMartini: ImageVector? = null
