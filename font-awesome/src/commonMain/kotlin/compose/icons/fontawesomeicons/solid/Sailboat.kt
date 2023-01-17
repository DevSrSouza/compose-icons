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

public val SolidGroup.Sailboat: ImageVector
    get() {
        if (_sailboat != null) {
            return _sailboat!!
        }
        _sailboat = Builder(name = "Sailboat", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 16.0f)
                curveToRelative(0.0f, -7.0f, 4.5f, -13.2f, 11.2f, -15.3f)
                reflectiveCurveToRelative(13.9f, 0.4f, 17.9f, 6.1f)
                lineToRelative(224.0f, 320.0f)
                curveToRelative(3.4f, 4.9f, 3.8f, 11.3f, 1.1f, 16.6f)
                reflectiveCurveToRelative(-8.2f, 8.6f, -14.2f, 8.6f)
                horizontalLineTo(272.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, -7.2f, -16.0f, -16.0f)
                verticalLineTo(16.0f)
                close()
                moveTo(212.1f, 96.5f)
                curveToRelative(7.0f, 1.9f, 11.9f, 8.2f, 11.9f, 15.5f)
                verticalLineTo(336.0f)
                curveToRelative(0.0f, 8.8f, -7.2f, 16.0f, -16.0f, 16.0f)
                horizontalLineTo(80.0f)
                curveToRelative(-5.7f, 0.0f, -11.0f, -3.0f, -13.8f, -8.0f)
                reflectiveCurveToRelative(-2.9f, -11.0f, -0.1f, -16.0f)
                lineToRelative(128.0f, -224.0f)
                curveToRelative(3.6f, -6.3f, 11.0f, -9.4f, 18.0f, -7.5f)
                close()
                moveTo(5.7f, 404.3f)
                curveTo(2.8f, 394.1f, 10.5f, 384.0f, 21.1f, 384.0f)
                horizontalLineTo(554.9f)
                curveToRelative(10.6f, 0.0f, 18.3f, 10.1f, 15.4f, 20.3f)
                lineToRelative(-4.0f, 14.3f)
                curveTo(550.7f, 473.9f, 500.4f, 512.0f, 443.0f, 512.0f)
                horizontalLineTo(133.0f)
                curveTo(75.6f, 512.0f, 25.3f, 473.9f, 9.7f, 418.7f)
                lineToRelative(-4.0f, -14.3f)
                close()
            }
        }
        .build()
        return _sailboat!!
    }

private var _sailboat: ImageVector? = null
