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

public val TablerIcons.BrandSamsungpass: ImageVector
    get() {
        if (_brandSamsungpass != null) {
            return _brandSamsungpass!!
        }
        _brandSamsungpass = Builder(name = "BrandSamsungpass", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 10.0f)
                moveToRelative(0.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(7.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                horizontalLineToRelative(-12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 10.0f)
                verticalLineToRelative(-1.862f)
                curveToRelative(0.0f, -2.838f, 2.239f, -5.138f, 5.0f, -5.138f)
                reflectiveCurveToRelative(5.0f, 2.3f, 5.0f, 5.138f)
                verticalLineToRelative(1.862f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.485f, 17.577f)
                curveToRelative(0.337f, 0.29f, 0.7f, 0.423f, 1.515f, 0.423f)
                horizontalLineToRelative(0.413f)
                curveToRelative(0.323f, 0.0f, 0.633f, -0.133f, 0.862f, -0.368f)
                arcToRelative(1.27f, 1.27f, 0.0f, false, false, 0.356f, -0.886f)
                curveToRelative(0.0f, -0.332f, -0.128f, -0.65f, -0.356f, -0.886f)
                arcToRelative(1.203f, 1.203f, 0.0f, false, false, -0.862f, -0.368f)
                horizontalLineToRelative(-0.826f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, true, -0.861f, -0.367f)
                arcToRelative(1.27f, 1.27f, 0.0f, false, true, -0.356f, -0.886f)
                curveToRelative(0.0f, -0.332f, 0.128f, -0.651f, 0.356f, -0.886f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, true, 0.861f, -0.368f)
                horizontalLineToRelative(0.413f)
                curveToRelative(0.816f, 0.0f, 1.178f, 0.133f, 1.515f, 0.423f)
            }
        }
        .build()
        return _brandSamsungpass!!
    }

private var _brandSamsungpass: ImageVector? = null
