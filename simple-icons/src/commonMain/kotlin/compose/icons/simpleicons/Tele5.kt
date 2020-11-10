package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.VectorAsset
import androidx.compose.ui.graphics.vector.VectorAssetBuilder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Tele5: VectorAsset
    get() {
        if (_tele5 != null) {
            return _tele5!!
        }
        _tele5 = VectorAssetBuilder(name = "Tele5", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.441f, 0.682f)
                verticalLineToRelative(12.894f)
                horizontalLineToRelative(9.0f)
                lineToRelative(-9.425f, 4.11f)
                arcToRelative(9.383f, 9.383f, 0.0f, false, false, 12.351f, 4.851f)
                verticalLineToRelative(0.002f)
                arcToRelative(9.383f, 9.383f, 0.0f, false, false, 4.85f, -12.353f)
                lineToRelative(-7.694f, 3.353f)
                lineTo(15.523f, 8.293f)
                horizontalLineToRelative(7.5f)
                lineTo(23.023f, 0.682f)
                lineTo(6.441f, 0.682f)
                close()
                moveTo(0.0f, 0.688f)
                verticalLineToRelative(5.216f)
                horizontalLineToRelative(5.453f)
                lineTo(5.453f, 0.688f)
                lineTo(3.607f, 0.688f)
                verticalLineToRelative(2.484f)
                horizontalLineToRelative(-0.439f)
                lineTo(3.168f, 0.688f)
                horizontalLineToRelative(-0.88f)
                verticalLineToRelative(2.484f)
                horizontalLineToRelative(-0.442f)
                lineTo(1.846f, 0.688f)
                lineTo(0.0f, 0.688f)
                close()
                moveTo(2.727f, 6.377f)
                verticalLineToRelative(2.236f)
                lineTo(0.002f, 8.613f)
                verticalLineToRelative(2.723f)
                horizontalLineToRelative(5.453f)
                lineTo(5.455f, 6.377f)
                lineTo(2.727f, 6.377f)
                close()
                moveTo(3.605f, 11.805f)
                verticalLineToRelative(2.488f)
                horizontalLineToRelative(-0.437f)
                verticalLineToRelative(-2.486f)
                horizontalLineToRelative(-0.88f)
                verticalLineToRelative(2.486f)
                horizontalLineToRelative(-0.442f)
                verticalLineToRelative(-2.486f)
                lineTo(0.0f, 11.807f)
                verticalLineToRelative(5.216f)
                horizontalLineToRelative(5.453f)
                verticalLineToRelative(-5.218f)
                lineTo(3.605f, 11.805f)
                close()
                moveTo(0.002f, 17.467f)
                lineTo(0.002f, 23.2f)
                horizontalLineToRelative(2.732f)
                verticalLineToRelative(-1.49f)
                horizontalLineToRelative(2.721f)
                verticalLineToRelative(-2.703f)
                horizontalLineToRelative(-2.72f)
                verticalLineToRelative(-1.54f)
                lineTo(0.001f, 17.467f)
                close()
            }
        }
        .build()
        return _tele5!!
    }

private var _tele5: VectorAsset? = null
