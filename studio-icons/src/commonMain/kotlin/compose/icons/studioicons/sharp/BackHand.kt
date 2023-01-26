package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.BackHand: ImageVector
    get() {
        if (_backHand != null) {
            return _backHand!!
        }
        _backHand = Builder(name = "BackHand", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.21f, 10.47f)
                lineTo(5.0f, 9.36f)
                lineTo(7.25f, 15.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(0.0f)
                horizontalLineTo(14.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(1.5f)
                horizontalLineToRelative(2.5f)
                verticalLineTo(12.0f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(4.5f)
                horizontalLineTo(21.0f)
                verticalLineTo(16.0f)
                curveToRelative(0.0f, 4.42f, -3.58f, 8.0f, -8.0f, 8.0f)
                curveToRelative(-3.26f, 0.0f, -6.19f, -1.99f, -7.4f, -5.02f)
                lineTo(2.21f, 10.47f)
                close()
            }
        }
        .build()
        return _backHand!!
    }

private var _backHand: ImageVector? = null
