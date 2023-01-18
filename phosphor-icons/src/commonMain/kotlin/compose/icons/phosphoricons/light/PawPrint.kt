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

public val LightGroup.PawPrint: ImageVector
    get() {
        if (_pawPrint != null) {
            return _pawPrint!!
        }
        _pawPrint = Builder(name = "PawPrint", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(212.0f, 82.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, true, false, 26.0f, 26.0f)
                arcTo(26.1f, 26.1f, 0.0f, false, false, 212.0f, 82.0f)
                close()
                moveTo(212.0f, 122.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, true, true, 14.0f, -14.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 212.0f, 122.0f)
                close()
                moveTo(70.0f, 108.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, true, false, -26.0f, 26.0f)
                arcTo(26.1f, 26.1f, 0.0f, false, false, 70.0f, 108.0f)
                close()
                moveTo(44.0f, 122.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, true, true, 14.0f, -14.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 44.0f, 122.0f)
                close()
                moveTo(92.0f, 86.0f)
                arcTo(26.0f, 26.0f, 0.0f, true, false, 66.0f, 60.0f)
                arcTo(26.1f, 26.1f, 0.0f, false, false, 92.0f, 86.0f)
                close()
                moveTo(92.0f, 46.0f)
                arcTo(14.0f, 14.0f, 0.0f, true, true, 78.0f, 60.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 92.0f, 46.0f)
                close()
                moveTo(164.0f, 86.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, true, false, -26.0f, -26.0f)
                arcTo(26.1f, 26.1f, 0.0f, false, false, 164.0f, 86.0f)
                close()
                moveTo(164.0f, 46.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, true, true, -14.0f, 14.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 164.0f, 46.0f)
                close()
                moveTo(186.1f, 150.6f)
                arcToRelative(37.4f, 37.4f, 0.0f, false, true, -17.8f, -22.3f)
                arcToRelative(42.0f, 42.0f, 0.0f, false, false, -80.6f, 0.0f)
                arcToRelative(37.4f, 37.4f, 0.0f, false, true, -17.8f, 22.3f)
                arcTo(38.0f, 38.0f, 0.0f, false, false, 102.8f, 219.0f)
                arcToRelative(65.7f, 65.7f, 0.0f, false, true, 50.4f, 0.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, 32.9f, -68.4f)
                close()
                moveTo(168.0f, 210.0f)
                arcToRelative(25.9f, 25.9f, 0.0f, false, true, -10.2f, -2.1f)
                arcTo(79.1f, 79.1f, 0.0f, false, false, 128.0f, 202.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, false, -29.9f, 5.9f)
                arcTo(25.0f, 25.0f, 0.0f, false, true, 88.0f, 210.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, -12.3f, -48.9f)
                arcToRelative(49.5f, 49.5f, 0.0f, false, false, 23.5f, -29.5f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, true, 57.6f, 0.0f)
                arcToRelative(49.5f, 49.5f, 0.0f, false, false, 23.5f, 29.5f)
                horizontalLineToRelative(0.1f)
                arcTo(26.0f, 26.0f, 0.0f, false, true, 168.0f, 210.0f)
                close()
            }
        }
        .build()
        return _pawPrint!!
    }

private var _pawPrint: ImageVector? = null
