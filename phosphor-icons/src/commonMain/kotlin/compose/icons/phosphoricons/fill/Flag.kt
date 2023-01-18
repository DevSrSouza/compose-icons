package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.Flag: ImageVector
    get() {
        if (_flag != null) {
            return _flag!!
        }
        _flag = Builder(name = "Flag", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 48.0f)
                verticalLineTo(168.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, -3.2f, 6.4f)
                curveToRelative(-15.1f, 11.4f, -29.6f, 15.4f, -43.4f, 15.4f)
                curveToRelative(-18.8f, 0.0f, -36.3f, -7.5f, -52.6f, -14.4f)
                curveTo(98.1f, 163.9f, 74.9f, 154.0f, 48.0f, 172.1f)
                verticalLineTo(216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                verticalLineTo(47.4f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, true, 0.1f, -0.4f)
                verticalLineToRelative(-0.4f)
                curveToRelative(0.0f, -0.1f, 0.1f, -0.2f, 0.1f, -0.4f)
                reflectiveCurveToRelative(0.1f, -0.2f, 0.1f, -0.3f)
                reflectiveCurveToRelative(0.1f, -0.3f, 0.1f, -0.4f)
                reflectiveCurveToRelative(0.1f, -0.2f, 0.1f, -0.3f)
                reflectiveCurveToRelative(0.1f, -0.3f, 0.2f, -0.4f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, true, 0.2f, -0.4f)
                curveToRelative(0.0f, -0.1f, 0.1f, -0.2f, 0.1f, -0.3f)
                lineToRelative(0.2f, -0.4f)
                curveToRelative(0.1f, -0.1f, 0.2f, -0.2f, 0.2f, -0.3f)
                lineToRelative(0.3f, -0.3f)
                lineToRelative(0.2f, -0.3f)
                lineToRelative(0.3f, -0.3f)
                lineToRelative(0.2f, -0.3f)
                lineToRelative(0.3f, -0.2f)
                lineToRelative(0.4f, -0.3f)
                horizontalLineToRelative(0.1f)
                curveToRelative(35.7f, -26.8f, 67.7f, -13.1f, 95.9f, -1.0f)
                reflectiveCurveToRelative(51.8f, 22.2f, 80.1f, 1.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 224.0f, 48.0f)
                close()
            }
        }
        .build()
        return _flag!!
    }

private var _flag: ImageVector? = null
