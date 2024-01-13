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

public val SolidGroup.Children: ImageVector
    get() {
        if (_children != null) {
            return _children!!
        }
        _children = Builder(name = "Children", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 0.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, true, 0.0f, 128.0f)
                arcTo(64.0f, 64.0f, 0.0f, true, true, 160.0f, 0.0f)
                close()
                moveTo(88.0f, 480.0f)
                lineTo(88.0f, 400.0f)
                lineTo(70.2f, 400.0f)
                curveToRelative(-10.9f, 0.0f, -18.6f, -10.7f, -15.2f, -21.1f)
                lineToRelative(31.1f, -93.4f)
                lineTo(57.5f, 323.3f)
                curveToRelative(-10.7f, 14.1f, -30.8f, 16.8f, -44.8f, 6.2f)
                reflectiveCurveToRelative(-16.8f, -30.7f, -6.2f, -44.8f)
                lineTo(65.4f, 207.0f)
                curveToRelative(22.4f, -29.6f, 57.5f, -47.0f, 94.6f, -47.0f)
                reflectiveCurveToRelative(72.2f, 17.4f, 94.6f, 47.0f)
                lineToRelative(58.9f, 77.7f)
                curveToRelative(10.7f, 14.1f, 7.9f, 34.2f, -6.2f, 44.8f)
                reflectiveCurveToRelative(-34.2f, 7.9f, -44.8f, -6.2f)
                lineToRelative(-28.6f, -37.8f)
                lineTo(265.0f, 378.9f)
                curveToRelative(3.5f, 10.4f, -4.3f, 21.1f, -15.2f, 21.1f)
                lineTo(232.0f, 400.0f)
                verticalLineToRelative(80.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                lineTo(168.0f, 400.0f)
                lineTo(152.0f, 400.0f)
                verticalLineToRelative(80.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                close()
                moveTo(480.0f, 0.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, true, 0.0f, 128.0f)
                arcTo(64.0f, 64.0f, 0.0f, true, true, 480.0f, 0.0f)
                close()
                moveTo(472.0f, 384.0f)
                verticalLineToRelative(96.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                lineTo(408.0f, 300.5f)
                lineTo(395.1f, 321.0f)
                curveToRelative(-9.4f, 15.0f, -29.2f, 19.4f, -44.1f, 10.0f)
                reflectiveCurveToRelative(-19.4f, -29.2f, -10.0f, -44.1f)
                lineToRelative(51.7f, -82.1f)
                curveToRelative(17.6f, -27.9f, 48.3f, -44.9f, 81.2f, -44.9f)
                horizontalLineToRelative(12.3f)
                curveToRelative(33.0f, 0.0f, 63.7f, 16.9f, 81.2f, 44.9f)
                lineTo(619.1f, 287.0f)
                curveToRelative(9.4f, 15.0f, 4.9f, 34.7f, -10.0f, 44.1f)
                reflectiveCurveToRelative(-34.7f, 4.9f, -44.1f, -10.0f)
                lineTo(552.0f, 300.5f)
                lineTo(552.0f, 480.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                lineTo(488.0f, 384.0f)
                lineTo(472.0f, 384.0f)
                close()
            }
        }
        .build()
        return _children!!
    }

private var _children: ImageVector? = null
