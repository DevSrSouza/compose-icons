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

public val SolidGroup.Landmark: ImageVector
    get() {
        if (_landmark != null) {
            return _landmark!!
        }
        _landmark = Builder(name = "Landmark", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.1f, 4.2f)
                curveToRelative(9.8f, -5.6f, 21.9f, -5.6f, 31.8f, 0.0f)
                lineToRelative(171.8f, 98.1f)
                lineTo(448.0f, 104.0f)
                lineToRelative(0.0f, 0.9f)
                lineToRelative(47.9f, 27.4f)
                curveToRelative(12.6f, 7.2f, 18.8f, 22.0f, 15.1f, 36.0f)
                reflectiveCurveToRelative(-16.4f, 23.8f, -30.9f, 23.8f)
                horizontalLineTo(32.0f)
                curveToRelative(-14.5f, 0.0f, -27.2f, -9.8f, -30.9f, -23.8f)
                reflectiveCurveToRelative(2.5f, -28.8f, 15.1f, -36.0f)
                lineTo(64.0f, 104.9f)
                verticalLineTo(104.0f)
                lineToRelative(4.4f, -1.6f)
                lineTo(240.1f, 4.2f)
                close()
                moveTo(64.0f, 224.0f)
                horizontalLineToRelative(64.0f)
                verticalLineTo(416.0f)
                horizontalLineToRelative(40.0f)
                verticalLineTo(224.0f)
                horizontalLineToRelative(64.0f)
                verticalLineTo(416.0f)
                horizontalLineToRelative(48.0f)
                verticalLineTo(224.0f)
                horizontalLineToRelative(64.0f)
                verticalLineTo(416.0f)
                horizontalLineToRelative(40.0f)
                verticalLineTo(224.0f)
                horizontalLineToRelative(64.0f)
                verticalLineTo(420.3f)
                curveToRelative(0.6f, 0.3f, 1.2f, 0.7f, 1.8f, 1.1f)
                lineToRelative(48.0f, 32.0f)
                curveToRelative(11.7f, 7.8f, 17.0f, 22.4f, 12.9f, 35.9f)
                reflectiveCurveTo(494.1f, 512.0f, 480.0f, 512.0f)
                horizontalLineTo(32.0f)
                curveToRelative(-14.1f, 0.0f, -26.5f, -9.2f, -30.6f, -22.7f)
                reflectiveCurveToRelative(1.1f, -28.1f, 12.9f, -35.9f)
                lineToRelative(48.0f, -32.0f)
                curveToRelative(0.6f, -0.4f, 1.2f, -0.7f, 1.8f, -1.1f)
                verticalLineTo(224.0f)
                close()
            }
        }
        .build()
        return _landmark!!
    }

private var _landmark: ImageVector? = null
