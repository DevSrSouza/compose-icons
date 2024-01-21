package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.BrandOpenai: ImageVector
    get() {
        if (_brandOpenai != null) {
            return _brandOpenai!!
        }
        _brandOpenai = Builder(name = "BrandOpenai", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.217f, 19.384f)
                arcToRelative(3.501f, 3.501f, 0.0f, false, false, 6.783f, -1.217f)
                verticalLineToRelative(-5.167f)
                lineToRelative(-6.0f, -3.35f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.214f, 15.014f)
                arcToRelative(3.501f, 3.501f, 0.0f, false, false, 4.446f, 5.266f)
                lineToRelative(4.34f, -2.534f)
                verticalLineToRelative(-6.946f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 7.63f)
                curveToRelative(-1.391f, -0.236f, -2.787f, 0.395f, -3.534f, 1.689f)
                arcToRelative(3.474f, 3.474f, 0.0f, false, false, 1.271f, 4.745f)
                lineToRelative(4.263f, 2.514f)
                lineToRelative(6.0f, -3.348f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.783f, 4.616f)
                arcToRelative(3.501f, 3.501f, 0.0f, false, false, -6.783f, 1.217f)
                verticalLineToRelative(5.067f)
                lineToRelative(6.0f, 3.45f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.786f, 8.986f)
                arcToRelative(3.501f, 3.501f, 0.0f, false, false, -4.446f, -5.266f)
                lineToRelative(-4.34f, 2.534f)
                verticalLineToRelative(6.946f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 16.302f)
                curveToRelative(1.391f, 0.236f, 2.787f, -0.395f, 3.534f, -1.689f)
                arcToRelative(3.474f, 3.474f, 0.0f, false, false, -1.271f, -4.745f)
                lineToRelative(-4.308f, -2.514f)
                lineToRelative(-5.955f, 3.42f)
            }
        }
        .build()
        return _brandOpenai!!
    }

private var _brandOpenai: ImageVector? = null
