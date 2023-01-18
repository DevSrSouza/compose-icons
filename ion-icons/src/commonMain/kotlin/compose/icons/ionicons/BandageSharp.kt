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

public val IonIcons.BandageSharp: ImageVector
    get() {
        if (_bandageSharp != null) {
            return _bandageSharp!!
        }
        _bandageSharp = Builder(name = "BandageSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(27.71f, 337.1f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 0.0f, 56.54f)
                lineToRelative(90.65f, 90.65f)
                horizontalLineToRelative(0.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 56.54f, 0.0f)
                lineToRelative(75.1f, -75.1f)
                lineTo(102.81f, 262.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(496.0f, 147.1f)
                arcToRelative(39.87f, 39.87f, 0.0f, false, false, -11.75f, -28.38f)
                lineToRelative(-91.0f, -91.0f)
                arcToRelative(40.14f, 40.14f, 0.0f, false, false, -56.75f, 0.0f)
                lineTo(264.0f, 100.28f)
                lineTo(411.72f, 248.0f)
                lineToRelative(72.53f, -72.53f)
                arcTo(39.85f, 39.85f, 0.0f, false, false, 496.0f, 147.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(273.06f, 386.19f)
                lineToRelative(116.0f, -116.0f)
                lineTo(241.77f, 123.0f)
                lineToRelative(-116.0f, 116.0f)
                close()
                moveTo(292.69f, 244.69f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 0.0f, 22.62f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 292.69f, 244.69f)
                close()
                moveTo(244.69f, 196.69f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 0.0f, 22.62f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 244.69f, 196.69f)
                close()
                moveTo(244.69f, 292.69f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 0.0f, 22.62f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 244.69f, 292.69f)
                close()
                moveTo(219.31f, 244.69f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -22.62f, 0.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 219.31f, 244.69f)
                close()
            }
        }
        .build()
        return _bandageSharp!!
    }

private var _bandageSharp: ImageVector? = null
