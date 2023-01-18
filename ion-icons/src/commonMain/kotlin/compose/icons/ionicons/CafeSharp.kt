package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.CafeSharp: ImageVector
    get() {
        if (_cafeSharp != null) {
            return _cafeSharp!!
        }
        _cafeSharp = Builder(name = "CafeSharp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(448.0f, 64.0f)
                lineTo(80.0f, 64.0f)
                lineTo(80.0f, 318.34f)
                arcToRelative(19.83f, 19.83f, 0.0f, false, false, 5.86f, 14.14f)
                lineToRelative(29.65f, 29.66f)
                arcTo(19.87f, 19.87f, 0.0f, false, false, 129.66f, 368.0f)
                lineTo(334.34f, 368.0f)
                arcToRelative(19.87f, 19.87f, 0.0f, false, false, 14.15f, -5.86f)
                lineToRelative(29.65f, -29.66f)
                arcTo(19.83f, 19.83f, 0.0f, false, false, 384.0f, 318.34f)
                lineTo(384.0f, 192.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 11.31f, -4.69f)
                lineToRelative(32.0f, -32.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 464.0f, 144.0f)
                lineTo(464.0f, 80.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 448.0f, 64.0f)
                close()
                moveTo(432.0f, 137.37f)
                lineTo(409.37f, 160.0f)
                lineTo(384.0f, 160.0f)
                lineTo(384.0f, 96.0f)
                horizontalLineToRelative(48.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(48.0f, 400.0f)
                horizontalLineToRelative(368.0f)
                verticalLineToRelative(32.0f)
                horizontalLineToRelative(-368.0f)
                close()
            }
        }
        .build()
        return _cafeSharp!!
    }

private var _cafeSharp: ImageVector? = null
