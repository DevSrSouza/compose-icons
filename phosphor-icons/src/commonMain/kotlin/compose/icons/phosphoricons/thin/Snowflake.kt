package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.Snowflake: ImageVector
    get() {
        if (_snowflake != null) {
            return _snowflake!!
        }
        _snowflake = Builder(name = "Snowflake", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(220.1f, 150.2f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -2.9f, 4.9f)
                lineToRelative(-28.9f, 7.7f)
                lineToRelative(7.8f, 28.9f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.9f, 4.9f)
                lineToRelative(-1.0f, 0.2f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -3.9f, -3.0f)
                lineTo(180.0f, 162.6f)
                lineToRelative(-48.0f, -27.7f)
                verticalLineToRelative(55.4f)
                lineToRelative(22.8f, 22.9f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 0.0f, 5.6f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -5.6f, 0.0f)
                lineTo(128.0f, 197.7f)
                lineToRelative(-21.2f, 21.1f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.6f, -5.6f)
                lineTo(124.0f, 190.3f)
                verticalLineTo(134.9f)
                lineTo(76.0f, 162.6f)
                lineToRelative(-8.3f, 31.2f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -3.9f, 3.0f)
                lineToRelative(-1.0f, -0.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.9f, -4.9f)
                lineToRelative(7.8f, -28.9f)
                lineToRelative(-28.9f, -7.7f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -2.9f, -4.9f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 4.9f, -2.8f)
                lineTo(72.0f, 155.7f)
                lineTo(120.0f, 128.0f)
                lineTo(72.0f, 100.3f)
                lineToRelative(-31.2f, 8.3f)
                lineToRelative(-1.0f, 0.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.0f, -7.9f)
                lineToRelative(28.9f, -7.7f)
                lineTo(59.9f, 64.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.9f, -4.9f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 4.9f, 2.8f)
                lineTo(76.0f, 93.4f)
                lineToRelative(48.0f, 27.7f)
                verticalLineTo(65.7f)
                lineTo(101.2f, 42.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.6f, -5.6f)
                lineTo(128.0f, 58.3f)
                lineToRelative(21.2f, -21.1f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 5.6f, 5.6f)
                lineTo(132.0f, 65.7f)
                verticalLineToRelative(55.4f)
                lineToRelative(48.0f, -27.7f)
                lineToRelative(8.3f, -31.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 4.9f, -2.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.9f, 4.9f)
                lineToRelative(-7.8f, 28.9f)
                lineToRelative(28.9f, 7.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.0f, 7.9f)
                lineToRelative(-1.0f, -0.2f)
                lineTo(184.0f, 100.3f)
                lineTo(136.0f, 128.0f)
                lineToRelative(48.0f, 27.7f)
                lineToRelative(31.2f, -8.3f)
                arcTo(3.9f, 3.9f, 0.0f, false, true, 220.1f, 150.2f)
                close()
            }
        }
        .build()
        return _snowflake!!
    }

private var _snowflake: ImageVector? = null
