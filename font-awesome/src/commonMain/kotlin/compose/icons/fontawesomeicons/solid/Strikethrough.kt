package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Strikethrough: ImageVector
    get() {
        if (_strikethrough != null) {
            return _strikethrough!!
        }
        _strikethrough = Builder(name = "Strikethrough", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(496.0f, 224.0f)
                lineTo(293.9f, 224.0f)
                lineToRelative(-87.17f, -26.83f)
                arcTo(43.55f, 43.55f, 0.0f, false, true, 219.55f, 112.0f)
                horizontalLineToRelative(66.79f)
                arcTo(49.89f, 49.89f, 0.0f, false, true, 331.0f, 139.58f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 21.46f, 7.15f)
                lineToRelative(42.94f, -21.47f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 7.16f, -21.46f)
                lineToRelative(-0.53f, -1.0f)
                arcTo(128.0f, 128.0f, 0.0f, false, false, 287.51f, 32.0f)
                horizontalLineToRelative(-68.0f)
                arcToRelative(123.68f, 123.68f, 0.0f, false, false, -123.0f, 135.64f)
                curveToRelative(2.0f, 20.89f, 10.1f, 39.83f, 21.78f, 56.36f)
                lineTo(16.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(480.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineToRelative(-32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                close()
                moveTo(315.76f, 320.0f)
                arcTo(43.0f, 43.0f, 0.0f, false, true, 336.0f, 356.45f)
                arcTo(43.59f, 43.59f, 0.0f, false, true, 292.45f, 400.0f)
                horizontalLineToRelative(-66.79f)
                arcTo(49.89f, 49.89f, 0.0f, false, true, 181.0f, 372.42f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -21.46f, -7.15f)
                lineToRelative(-42.94f, 21.47f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -7.16f, 21.46f)
                lineToRelative(0.53f, 1.0f)
                arcTo(128.0f, 128.0f, 0.0f, false, false, 224.49f, 480.0f)
                horizontalLineToRelative(68.0f)
                arcToRelative(123.68f, 123.68f, 0.0f, false, false, 123.0f, -135.64f)
                arcToRelative(114.25f, 114.25f, 0.0f, false, false, -5.34f, -24.36f)
                close()
            }
        }
        .build()
        return _strikethrough!!
    }

private var _strikethrough: ImageVector? = null
