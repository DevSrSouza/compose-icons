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

public val SharpGroup._1k: ImageVector
    get() {
        if (__1k != null) {
            return __1k!!
        }
        __1k = Builder(name = "_1k", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 3.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(18.0f)
                horizontalLineToRelative(18.0f)
                verticalLineTo(3.0f)
                close()
                moveTo(10.0f, 15.0f)
                horizontalLineTo(8.5f)
                verticalLineToRelative(-4.5f)
                horizontalLineTo(7.0f)
                verticalLineTo(9.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(15.0f)
                close()
                moveTo(17.0f, 15.0f)
                horizontalLineToRelative(-1.75f)
                lineToRelative(-1.75f, -2.25f)
                verticalLineTo(15.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(9.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(2.25f)
                lineTo(15.25f, 9.0f)
                horizontalLineTo(17.0f)
                lineToRelative(-2.25f, 3.0f)
                lineTo(17.0f, 15.0f)
                close()
            }
        }
        .build()
        return __1k!!
    }

private var __1k: ImageVector? = null