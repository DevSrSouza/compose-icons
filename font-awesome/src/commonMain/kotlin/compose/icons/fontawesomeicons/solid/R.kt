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

public val SolidGroup.R: ImageVector
    get() {
        if (_r != null) {
            return _r!!
        }
        _r = Builder(name = "R", defaultWidth = 320.0.dp, defaultHeight = 512.0.dp, viewportWidth =
                320.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 32.0f)
                curveTo(28.7f, 32.0f, 0.0f, 60.7f, 0.0f, 96.0f)
                verticalLineTo(288.0f)
                verticalLineTo(448.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                verticalLineTo(320.0f)
                horizontalLineToRelative(95.3f)
                lineTo(261.8f, 466.4f)
                curveToRelative(10.1f, 14.5f, 30.1f, 18.0f, 44.6f, 7.9f)
                reflectiveCurveToRelative(18.0f, -30.1f, 7.9f, -44.6f)
                lineTo(230.1f, 309.5f)
                curveTo(282.8f, 288.1f, 320.0f, 236.4f, 320.0f, 176.0f)
                curveToRelative(0.0f, -79.5f, -64.5f, -144.0f, -144.0f, -144.0f)
                horizontalLineTo(64.0f)
                close()
                moveTo(176.0f, 256.0f)
                horizontalLineTo(64.0f)
                verticalLineTo(96.0f)
                horizontalLineTo(176.0f)
                curveToRelative(44.2f, 0.0f, 80.0f, 35.8f, 80.0f, 80.0f)
                reflectiveCurveToRelative(-35.8f, 80.0f, -80.0f, 80.0f)
                close()
            }
        }
        .build()
        return _r!!
    }

private var _r: ImageVector? = null
