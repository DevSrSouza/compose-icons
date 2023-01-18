package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.Medical: ImageVector
    get() {
        if (_medical != null) {
            return _medical!!
        }
        _medical = Builder(name = "Medical", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(272.0f, 464.0f)
                lineTo(240.0f, 464.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -32.0f, -32.0f)
                lineToRelative(0.05f, -85.82f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -6.0f, -3.47f)
                lineToRelative(-74.34f, 43.06f)
                arcToRelative(31.48f, 31.48f, 0.0f, false, true, -43.0f, -11.52f)
                lineTo(68.21f, 345.61f)
                lineToRelative(-0.06f, -0.1f)
                arcToRelative(31.65f, 31.65f, 0.0f, false, true, 11.56f, -42.8f)
                lineToRelative(74.61f, -43.25f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -6.92f)
                lineTo(79.78f, 209.33f)
                arcToRelative(31.41f, 31.41f, 0.0f, false, true, -11.55f, -43.0f)
                lineToRelative(16.44f, -28.55f)
                arcToRelative(31.48f, 31.48f, 0.0f, false, true, 19.27f, -14.74f)
                arcToRelative(31.14f, 31.14f, 0.0f, false, true, 23.8f, 3.2f)
                lineToRelative(74.31f, 43.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.0f, -3.47f)
                lineTo(208.0f, 80.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 32.0f, -32.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 32.0f, 32.0f)
                lineTo(304.0f, 165.72f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.0f, 3.47f)
                lineToRelative(74.34f, -43.06f)
                arcToRelative(31.51f, 31.51f, 0.0f, false, true, 43.0f, 11.52f)
                lineToRelative(16.49f, 28.64f)
                lineToRelative(0.06f, 0.09f)
                arcToRelative(31.52f, 31.52f, 0.0f, false, true, -11.64f, 42.86f)
                lineToRelative(-74.53f, 43.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 6.92f)
                lineToRelative(74.53f, 43.2f)
                arcToRelative(31.42f, 31.42f, 0.0f, false, true, 11.56f, 43.0f)
                lineToRelative(-16.44f, 28.55f)
                arcToRelative(31.48f, 31.48f, 0.0f, false, true, -19.27f, 14.74f)
                arcToRelative(31.14f, 31.14f, 0.0f, false, true, -23.8f, -3.2f)
                lineToRelative(-74.31f, -43.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -6.0f, 3.46f)
                lineTo(304.0f, 432.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 272.0f, 464.0f)
                close()
                moveTo(178.44f, 266.52f)
                horizontalLineToRelative(0.0f)
                close()
                moveTo(178.44f, 245.52f)
                horizontalLineToRelative(0.0f)
                close()
                moveTo(333.54f, 245.44f)
                close()
                moveTo(333.54f, 245.44f)
                horizontalLineToRelative(0.0f)
                close()
            }
        }
        .build()
        return _medical!!
    }

private var _medical: ImageVector? = null
