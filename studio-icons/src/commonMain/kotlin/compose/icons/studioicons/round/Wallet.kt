package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.Wallet: ImageVector
    get() {
        if (_wallet != null) {
            return _wallet!!
        }
        _wallet = Builder(name = "Wallet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 4.0f)
                horizontalLineTo(6.0f)
                curveTo(3.79f, 4.0f, 2.0f, 5.79f, 2.0f, 8.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f)
                verticalLineTo(8.0f)
                curveTo(22.0f, 5.79f, 20.21f, 4.0f, 18.0f, 4.0f)
                close()
                moveTo(16.14f, 13.77f)
                curveToRelative(-0.24f, 0.2f, -0.57f, 0.28f, -0.88f, 0.2f)
                lineTo(4.15f, 11.25f)
                curveTo(4.45f, 10.52f, 5.16f, 10.0f, 6.0f, 10.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(0.67f, 0.0f, 1.26f, 0.34f, 1.63f, 0.84f)
                lineTo(16.14f, 13.77f)
                close()
                moveTo(6.0f, 6.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f)
                verticalLineToRelative(0.55f)
                curveTo(19.41f, 8.21f, 18.73f, 8.0f, 18.0f, 8.0f)
                horizontalLineTo(6.0f)
                curveTo(5.27f, 8.0f, 4.59f, 8.21f, 4.0f, 8.55f)
                verticalLineTo(8.0f)
                curveTo(4.0f, 6.9f, 4.9f, 6.0f, 6.0f, 6.0f)
                close()
            }
        }
        .build()
        return _wallet!!
    }

private var _wallet: ImageVector? = null
