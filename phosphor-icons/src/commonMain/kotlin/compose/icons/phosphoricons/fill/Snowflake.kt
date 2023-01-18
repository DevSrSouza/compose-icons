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

public val FillGroup.Snowflake: ImageVector
    get() {
        if (_snowflake != null) {
            return _snowflake!!
        }
        _snowflake = Builder(name = "Snowflake", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(223.9f, 149.1f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -5.6f, 9.8f)
                lineToRelative(-25.1f, 6.8f)
                lineToRelative(6.7f, 25.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -5.6f, 9.8f)
                lineToRelative(-2.1f, 0.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.7f, -5.9f)
                lineToRelative(-7.9f, -29.6f)
                lineTo(136.0f, 141.9f)
                verticalLineToRelative(46.8f)
                lineToRelative(21.7f, 21.6f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 0.0f, 11.4f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, -11.4f, 0.0f)
                lineTo(128.0f, 203.3f)
                lineToRelative(-18.3f, 18.4f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, -11.4f, -11.4f)
                lineTo(120.0f, 188.7f)
                verticalLineTo(141.9f)
                lineTo(79.4f, 165.3f)
                lineToRelative(-7.9f, 29.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.7f, 5.9f)
                lineToRelative(-2.1f, -0.3f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -5.6f, -9.8f)
                lineToRelative(6.7f, -25.0f)
                lineToRelative(-25.1f, -6.8f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 4.2f, -15.4f)
                lineToRelative(29.5f, 7.9f)
                lineTo(112.0f, 128.0f)
                lineTo(71.4f, 104.6f)
                lineToRelative(-29.5f, 7.9f)
                arcToRelative(7.6f, 7.6f, 0.0f, false, true, -2.1f, 0.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -2.1f, -15.7f)
                lineToRelative(25.1f, -6.8f)
                lineToRelative(-6.7f, -25.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 15.4f, -4.2f)
                lineToRelative(7.9f, 29.6f)
                lineTo(120.0f, 114.1f)
                verticalLineTo(67.3f)
                lineTo(98.3f, 45.7f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 11.4f, -11.4f)
                lineTo(128.0f, 52.7f)
                lineToRelative(18.3f, -18.4f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 11.4f, 11.4f)
                lineTo(136.0f, 67.3f)
                verticalLineToRelative(46.8f)
                lineToRelative(40.6f, -23.4f)
                lineToRelative(7.9f, -29.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 15.4f, 4.2f)
                lineToRelative(-6.7f, 25.0f)
                lineToRelative(25.1f, 6.8f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -2.1f, 15.7f)
                lineToRelative(-2.1f, -0.3f)
                lineToRelative(-29.5f, -7.9f)
                lineTo(144.0f, 128.0f)
                lineToRelative(40.6f, 23.4f)
                lineToRelative(29.5f, -7.9f)
                arcTo(7.9f, 7.9f, 0.0f, false, true, 223.9f, 149.1f)
                close()
            }
        }
        .build()
        return _snowflake!!
    }

private var _snowflake: ImageVector? = null
