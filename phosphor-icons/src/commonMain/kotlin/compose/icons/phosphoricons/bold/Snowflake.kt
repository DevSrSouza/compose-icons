package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.Snowflake: ImageVector
    get() {
        if (_snowflake != null) {
            return _snowflake!!
        }
        _snowflake = Builder(name = "Snowflake", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(227.8f, 148.1f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -8.5f, 14.7f)
                lineToRelative(-21.2f, 5.7f)
                lineToRelative(5.7f, 21.2f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -8.5f, 14.7f)
                arcToRelative(11.0f, 11.0f, 0.0f, false, true, -3.1f, 0.4f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -11.6f, -8.9f)
                lineToRelative(-7.5f, -28.0f)
                lineTo(140.0f, 148.8f)
                verticalLineTo(187.0f)
                lineToRelative(20.5f, 20.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 17.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, -17.0f, 0.0f)
                lineTo(128.0f, 209.0f)
                lineToRelative(-15.5f, 15.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, -17.0f)
                lineTo(116.0f, 187.0f)
                verticalLineTo(148.8f)
                lineTo(82.9f, 167.9f)
                lineToRelative(-7.5f, 28.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -11.6f, 8.9f)
                arcToRelative(11.0f, 11.0f, 0.0f, false, true, -3.1f, -0.4f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -8.5f, -14.7f)
                lineToRelative(5.7f, -21.2f)
                lineToRelative(-21.2f, -5.7f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 6.2f, -23.2f)
                lineToRelative(28.0f, 7.5f)
                lineTo(104.0f, 128.0f)
                lineTo(70.9f, 108.9f)
                lineToRelative(-28.0f, 7.5f)
                arcToRelative(11.0f, 11.0f, 0.0f, false, true, -3.1f, 0.4f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -3.1f, -23.6f)
                lineToRelative(21.2f, -5.7f)
                lineTo(52.2f, 66.3f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 23.2f, -6.2f)
                lineToRelative(7.5f, 28.0f)
                lineTo(116.0f, 107.2f)
                verticalLineTo(69.0f)
                lineTo(95.5f, 48.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, -17.0f)
                lineTo(128.0f, 47.0f)
                lineToRelative(15.5f, -15.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 17.0f)
                lineTo(140.0f, 69.0f)
                verticalLineToRelative(38.2f)
                lineToRelative(33.1f, -19.1f)
                lineToRelative(7.5f, -28.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 23.2f, 6.2f)
                lineToRelative(-5.7f, 21.2f)
                lineToRelative(21.2f, 5.7f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -3.1f, 23.6f)
                arcToRelative(11.0f, 11.0f, 0.0f, false, true, -3.1f, -0.4f)
                lineToRelative(-28.0f, -7.5f)
                lineTo(152.0f, 128.0f)
                lineToRelative(33.1f, 19.1f)
                lineToRelative(28.0f, -7.5f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 227.8f, 148.1f)
                close()
            }
        }
        .build()
        return _snowflake!!
    }

private var _snowflake: ImageVector? = null
