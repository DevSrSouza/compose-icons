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

public val TablerIcons.BrandGooglePhotos: ImageVector
    get() {
        if (_brandGooglePhotos != null) {
            return _brandGooglePhotos!!
        }
        _brandGooglePhotos = Builder(name = "BrandGooglePhotos", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.5f, 7.0f)
                curveToRelative(2.485f, 0.0f, 4.5f, 1.974f, 4.5f, 4.409f)
                verticalLineToRelative(0.591f)
                horizontalLineToRelative(-8.397f)
                arcToRelative(0.61f, 0.61f, 0.0f, false, true, -0.426f, -0.173f)
                arcToRelative(0.585f, 0.585f, 0.0f, false, true, -0.177f, -0.418f)
                curveToRelative(0.0f, -2.435f, 2.015f, -4.409f, 4.5f, -4.409f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.5f, 17.0f)
                curveToRelative(-2.485f, 0.0f, -4.5f, -1.974f, -4.5f, -4.409f)
                verticalLineToRelative(-0.591f)
                horizontalLineToRelative(8.397f)
                curveToRelative(0.333f, 0.0f, 0.603f, 0.265f, 0.603f, 0.591f)
                curveToRelative(0.0f, 2.435f, -2.015f, 4.409f, -4.5f, 4.409f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 16.5f)
                curveToRelative(0.0f, -2.485f, 1.972f, -4.5f, 4.405f, -4.5f)
                horizontalLineToRelative(0.595f)
                verticalLineToRelative(8.392f)
                arcToRelative(0.61f, 0.61f, 0.0f, false, true, -0.173f, 0.431f)
                arcToRelative(0.584f, 0.584f, 0.0f, false, true, -0.422f, 0.177f)
                curveToRelative(-2.433f, 0.0f, -4.405f, -2.015f, -4.405f, -4.5f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 7.5f)
                curveToRelative(0.0f, 2.485f, -1.972f, 4.5f, -4.405f, 4.5f)
                horizontalLineToRelative(-0.595f)
                verticalLineToRelative(-8.397f)
                arcToRelative(0.61f, 0.61f, 0.0f, false, true, 0.175f, -0.428f)
                arcToRelative(0.584f, 0.584f, 0.0f, false, true, 0.42f, -0.175f)
                curveToRelative(2.433f, 0.0f, 4.405f, 2.015f, 4.405f, 4.5f)
                close()
            }
        }
        .build()
        return _brandGooglePhotos!!
    }

private var _brandGooglePhotos: ImageVector? = null
