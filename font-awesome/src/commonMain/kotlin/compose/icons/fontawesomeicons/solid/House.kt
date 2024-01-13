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

public val SolidGroup.House: ImageVector
    get() {
        if (_house != null) {
            return _house!!
        }
        _house = Builder(name = "House", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(575.8f, 255.5f)
                curveToRelative(0.0f, 18.0f, -15.0f, 32.1f, -32.0f, 32.1f)
                horizontalLineToRelative(-32.0f)
                lineToRelative(0.7f, 160.2f)
                curveToRelative(0.0f, 2.7f, -0.2f, 5.4f, -0.5f, 8.1f)
                verticalLineTo(472.0f)
                curveToRelative(0.0f, 22.1f, -17.9f, 40.0f, -40.0f, 40.0f)
                horizontalLineTo(456.0f)
                curveToRelative(-1.1f, 0.0f, -2.2f, 0.0f, -3.3f, -0.1f)
                curveToRelative(-1.4f, 0.1f, -2.8f, 0.1f, -4.2f, 0.1f)
                horizontalLineTo(416.0f)
                horizontalLineTo(392.0f)
                curveToRelative(-22.1f, 0.0f, -40.0f, -17.9f, -40.0f, -40.0f)
                verticalLineTo(448.0f)
                verticalLineTo(384.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                horizontalLineTo(256.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                verticalLineToRelative(64.0f)
                verticalLineToRelative(24.0f)
                curveToRelative(0.0f, 22.1f, -17.9f, 40.0f, -40.0f, 40.0f)
                horizontalLineTo(160.0f)
                horizontalLineTo(128.1f)
                curveToRelative(-1.5f, 0.0f, -3.0f, -0.1f, -4.5f, -0.2f)
                curveToRelative(-1.2f, 0.1f, -2.4f, 0.2f, -3.6f, 0.2f)
                horizontalLineTo(104.0f)
                curveToRelative(-22.1f, 0.0f, -40.0f, -17.9f, -40.0f, -40.0f)
                verticalLineTo(360.0f)
                curveToRelative(0.0f, -0.9f, 0.0f, -1.9f, 0.1f, -2.8f)
                verticalLineTo(287.6f)
                horizontalLineTo(32.0f)
                curveToRelative(-18.0f, 0.0f, -32.0f, -14.0f, -32.0f, -32.1f)
                curveToRelative(0.0f, -9.0f, 3.0f, -17.0f, 10.0f, -24.0f)
                lineTo(266.4f, 8.0f)
                curveToRelative(7.0f, -7.0f, 15.0f, -8.0f, 22.0f, -8.0f)
                reflectiveCurveToRelative(15.0f, 2.0f, 21.0f, 7.0f)
                lineTo(564.8f, 231.5f)
                curveToRelative(8.0f, 7.0f, 12.0f, 15.0f, 11.0f, 24.0f)
                close()
            }
        }
        .build()
        return _house!!
    }

private var _house: ImageVector? = null
