package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.Sourcetree: ImageVector
    get() {
        if (_sourcetree != null) {
            return _sourcetree!!
        }
        _sourcetree = Builder(name = "Sourcetree", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(427.2f, 203.0f)
                curveToRelative(0.0f, -112.1f, -90.9f, -203.0f, -203.0f, -203.0f)
                curveTo(112.1f, -0.2f, 21.2f, 90.6f, 21.0f, 202.6f)
                arcTo(202.86f, 202.86f, 0.0f, false, false, 161.5f, 396.0f)
                verticalLineToRelative(101.7f)
                arcToRelative(14.3f, 14.3f, 0.0f, false, false, 14.3f, 14.3f)
                horizontalLineToRelative(96.4f)
                arcToRelative(14.3f, 14.3f, 0.0f, false, false, 14.3f, -14.3f)
                lineTo(286.5f, 396.1f)
                arcTo(203.18f, 203.18f, 0.0f, false, false, 427.2f, 203.0f)
                close()
                moveTo(155.6f, 203.0f)
                curveToRelative(0.0f, -90.8f, 137.3f, -90.8f, 137.3f, 0.0f)
                curveToRelative(-0.1f, 89.9f, -137.3f, 91.0f, -137.3f, 0.0f)
                close()
            }
        }
        .build()
        return _sourcetree!!
    }

private var _sourcetree: ImageVector? = null
