package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.PaletteLine: ImageVector
    get() {
        if (_paletteLine != null) {
            return _paletteLine!!
        }
        _paletteLine = Builder(name = "PaletteLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveToRelative(5.522f, 0.0f, 10.0f, 3.978f, 10.0f, 8.889f)
                arcToRelative(5.558f, 5.558f, 0.0f, false, true, -5.556f, 5.555f)
                horizontalLineToRelative(-1.966f)
                curveToRelative(-0.922f, 0.0f, -1.667f, 0.745f, -1.667f, 1.667f)
                curveToRelative(0.0f, 0.422f, 0.167f, 0.811f, 0.422f, 1.1f)
                curveToRelative(0.267f, 0.3f, 0.434f, 0.689f, 0.434f, 1.122f)
                curveTo(13.667f, 21.256f, 12.9f, 22.0f, 12.0f, 22.0f)
                curveTo(6.478f, 22.0f, 2.0f, 17.522f, 2.0f, 12.0f)
                reflectiveCurveTo(6.478f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(10.811f, 18.111f)
                arcToRelative(3.664f, 3.664f, 0.0f, false, true, 3.667f, -3.667f)
                horizontalLineToRelative(1.966f)
                arcTo(3.558f, 3.558f, 0.0f, false, false, 20.0f, 10.89f)
                curveTo(20.0f, 7.139f, 16.468f, 4.0f, 12.0f, 4.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -0.676f, 15.972f)
                arcToRelative(3.648f, 3.648f, 0.0f, false, true, -0.513f, -1.86f)
                close()
                moveTo(7.5f, 12.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, -3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 3.0f)
                close()
                moveTo(16.5f, 12.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, -3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 3.0f)
                close()
                moveTo(12.0f, 9.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, -3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 3.0f)
                close()
            }
        }
        .build()
        return _paletteLine!!
    }

private var _paletteLine: ImageVector? = null
