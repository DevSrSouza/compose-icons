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

public val TablerIcons.BrandCloudflare: ImageVector
    get() {
        if (_brandCloudflare != null) {
            return _brandCloudflare!!
        }
        _brandCloudflare = Builder(name = "BrandCloudflare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.031f, 7.007f)
                curveToRelative(2.469f, -0.007f, 3.295f, 1.293f, 3.969f, 2.993f)
                curveToRelative(4.0f, 0.0f, 4.994f, 3.825f, 5.0f, 6.0f)
                horizontalLineToRelative(-20.0f)
                curveToRelative(-0.001f, -1.64f, 1.36f, -2.954f, 3.0f, -3.0f)
                curveToRelative(0.0f, -1.5f, 1.0f, -3.0f, 3.0f, -3.0f)
                curveToRelative(0.66f, -1.942f, 2.562f, -2.986f, 5.031f, -2.993f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 13.0f)
                horizontalLineToRelative(6.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 10.0f)
                lineToRelative(-2.5f, 6.0f)
            }
        }
        .build()
        return _brandCloudflare!!
    }

private var _brandCloudflare: ImageVector? = null
