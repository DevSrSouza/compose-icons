package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.Snowflake: ImageVector
    get() {
        if (_snowflake != null) {
            return _snowflake!!
        }
        _snowflake = Builder(name = "Snowflake", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(222.0f, 149.7f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, -4.2f, 7.3f)
                lineToRelative(-27.0f, 7.2f)
                lineToRelative(7.2f, 27.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.2f, 7.4f)
                lineToRelative(-1.6f, 0.2f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, true, -5.8f, -4.5f)
                lineTo(178.3f, 164.0f)
                lineTo(134.0f, 138.4f)
                verticalLineToRelative(51.1f)
                lineToRelative(22.2f, 22.3f)
                arcToRelative(5.9f, 5.9f, 0.0f, true, true, -8.4f, 8.4f)
                lineTo(128.0f, 200.5f)
                lineToRelative(-19.8f, 19.7f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, -8.4f, -8.4f)
                lineTo(122.0f, 189.5f)
                verticalLineTo(138.4f)
                lineTo(77.7f, 164.0f)
                lineToRelative(-8.1f, 30.3f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, true, -5.8f, 4.5f)
                lineToRelative(-1.6f, -0.2f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.2f, -7.4f)
                lineToRelative(7.2f, -27.0f)
                lineToRelative(-27.0f, -7.2f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, -4.2f, -7.3f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, true, 7.3f, -4.3f)
                lineToRelative(30.4f, 8.2f)
                lineTo(116.0f, 128.0f)
                lineTo(71.7f, 102.4f)
                lineToRelative(-30.4f, 8.2f)
                lineToRelative(-1.5f, 0.2f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.8f, -4.5f)
                arcTo(5.9f, 5.9f, 0.0f, false, true, 38.2f, 99.0f)
                lineToRelative(27.0f, -7.2f)
                lineTo(58.0f, 64.8f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 4.2f, -7.4f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, true, 7.4f, 4.3f)
                lineTo(77.7f, 92.0f)
                lineTo(122.0f, 117.6f)
                verticalLineTo(66.5f)
                lineTo(99.8f, 44.2f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, 8.4f, -8.4f)
                lineTo(128.0f, 55.5f)
                lineToRelative(19.8f, -19.7f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, 8.4f, 8.4f)
                lineTo(134.0f, 66.5f)
                verticalLineToRelative(51.1f)
                lineTo(178.3f, 92.0f)
                lineToRelative(8.1f, -30.3f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, true, 7.4f, -4.3f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 4.2f, 7.4f)
                lineToRelative(-7.2f, 27.0f)
                lineToRelative(27.0f, 7.2f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, 4.2f, 7.3f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.8f, 4.5f)
                lineToRelative(-1.5f, -0.2f)
                lineToRelative(-30.4f, -8.2f)
                lineTo(140.0f, 128.0f)
                lineToRelative(44.3f, 25.6f)
                lineToRelative(30.4f, -8.2f)
                arcTo(6.1f, 6.1f, 0.0f, false, true, 222.0f, 149.7f)
                close()
            }
        }
        .build()
        return _snowflake!!
    }

private var _snowflake: ImageVector? = null
