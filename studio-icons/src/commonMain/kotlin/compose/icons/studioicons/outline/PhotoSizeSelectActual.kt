package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.PhotoSizeSelectActual: ImageVector
    get() {
        if (_photoSizeSelectActual != null) {
            return _photoSizeSelectActual!!
        }
        _photoSizeSelectActual = Builder(name = "PhotoSizeSelectActual", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 3.0f)
                lineTo(3.0f, 3.0f)
                curveTo(2.0f, 3.0f, 1.0f, 4.0f, 1.0f, 5.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(1.0f, 0.0f, 2.0f, -1.0f, 2.0f, -2.0f)
                lineTo(23.0f, 5.0f)
                curveToRelative(0.0f, -1.0f, -1.0f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(21.0f, 18.92f)
                curveToRelative(-0.02f, 0.03f, -0.06f, 0.06f, -0.08f, 0.08f)
                lineTo(3.0f, 19.0f)
                lineTo(3.0f, 5.08f)
                lineTo(3.08f, 5.0f)
                horizontalLineToRelative(17.83f)
                curveToRelative(0.03f, 0.02f, 0.06f, 0.06f, 0.08f, 0.08f)
                verticalLineToRelative(13.84f)
                close()
                moveTo(11.0f, 15.51f)
                lineTo(8.5f, 12.5f)
                lineTo(5.0f, 17.0f)
                horizontalLineToRelative(14.0f)
                lineToRelative(-4.5f, -6.0f)
                close()
            }
        }
        .build()
        return _photoSizeSelectActual!!
    }

private var _photoSizeSelectActual: ImageVector? = null
