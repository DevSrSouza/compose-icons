package compose.icons.phosphoricons.duotone

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
import compose.icons.phosphoricons.DuotoneGroup

public val DuotoneGroup.Rocket: ImageVector
    get() {
        if (_rocket != null) {
            return _rocket!!
        }
        _rocket = Builder(name = "Rocket", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(73.9f, 111.4f)
                horizontalLineToRelative(0.0f)
                lineTo(42.5f, 149.0f)
                arcToRelative(7.6f, 7.6f, 0.0f, false, false, -1.6f, 6.8f)
                lineToRelative(12.3f, 55.7f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 66.0f, 216.0f)
                lineToRelative(30.0f, -24.0f)
                curveTo(78.4f, 161.4f, 72.7f, 134.5f, 73.9f, 111.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(181.5f, 110.7f)
                horizontalLineToRelative(0.0f)
                lineToRelative(31.4f, 37.7f)
                arcToRelative(7.6f, 7.6f, 0.0f, false, true, 1.6f, 6.8f)
                lineToRelative(-12.3f, 55.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -12.8f, 4.6f)
                lineToRelative(-30.0f, -24.0f)
                curveTo(177.0f, 160.7f, 182.7f, 133.8f, 181.5f, 110.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(144.0f, 216.0f)
                horizontalLineTo(112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 96.0f)
                moveToRelative(-12.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 24.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -24.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(219.6f, 143.9f)
                lineToRelative(-30.2f, -36.3f)
                arcToRelative(125.4f, 125.4f, 0.0f, false, false, -8.0f, -34.9f)
                curveToRelative(-11.6f, -30.2f, -32.1f, -50.0f, -43.4f, -59.1f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, -20.0f, -0.1f)
                curveToRelative(-11.4f, 9.1f, -32.2f, 28.9f, -43.9f, 59.1f)
                arcTo(121.5f, 121.5f, 0.0f, false, false, 66.0f, 108.3f)
                lineTo(36.4f, 143.9f)
                arcTo(16.1f, 16.1f, 0.0f, false, false, 33.0f, 157.6f)
                lineToRelative(12.4f, 55.6f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, 10.3f, 11.6f)
                arcToRelative(17.0f, 17.0f, 0.0f, false, false, 5.4f, 0.9f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 9.9f, -3.5f)
                lineTo(98.8f, 200.0f)
                horizontalLineToRelative(58.4f)
                lineTo(185.0f, 222.2f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 9.9f, 3.5f)
                arcToRelative(17.0f, 17.0f, 0.0f, false, false, 5.4f, -0.9f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, 10.3f, -11.6f)
                lineTo(223.0f, 157.6f)
                arcTo(16.1f, 16.1f, 0.0f, false, false, 219.6f, 143.9f)
                close()
                moveTo(128.0f, 26.0f)
                curveToRelative(70.3f, 57.1f, 41.4f, 131.0f, 27.2f, 158.0f)
                lineTo(100.7f, 184.0f)
                curveTo(52.7f, 96.3f, 109.2f, 41.0f, 128.0f, 26.0f)
                close()
                moveTo(61.0f, 209.7f)
                lineTo(48.7f, 154.1f)
                lineToRelative(17.9f, -21.5f)
                quadToRelative(3.5f, 28.1f, 19.1f, 57.4f)
                close()
                moveTo(195.0f, 209.7f)
                lineTo(170.2f, 189.9f)
                curveToRelative(10.4f, -19.7f, 16.6f, -39.0f, 18.8f, -57.8f)
                lineToRelative(18.3f, 22.0f)
                close()
            }
        }
        .build()
        return _rocket!!
    }

private var _rocket: ImageVector? = null
