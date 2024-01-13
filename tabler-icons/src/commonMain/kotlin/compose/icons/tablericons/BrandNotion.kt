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

public val TablerIcons.BrandNotion: ImageVector
    get() {
        if (_brandNotion != null) {
            return _brandNotion!!
        }
        _brandNotion = Builder(name = "BrandNotion", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.0f, 17.5f)
                verticalLineToRelative(-6.5f)
                horizontalLineToRelative(0.5f)
                lineToRelative(4.0f, 6.0f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(-6.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.077f, 20.071f)
                lineToRelative(-11.53f, 0.887f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.876f, -0.397f)
                lineToRelative(-2.471f, -3.294f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.2f, -0.6f)
                verticalLineToRelative(-10.741f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.923f, -0.997f)
                lineToRelative(11.389f, -0.876f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.262f, 0.33f)
                lineToRelative(1.535f, 1.023f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.891f, 1.664f)
                verticalLineToRelative(12.004f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.923f, 0.997f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.5f, 5.5f)
                lineToRelative(2.5f, 2.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.0f, 7.0f)
                lineToRelative(-13.0f, 1.0f)
                verticalLineToRelative(12.5f)
            }
        }
        .build()
        return _brandNotion!!
    }

private var _brandNotion: ImageVector? = null
