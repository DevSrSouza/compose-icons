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

public val SharpGroup._10k: ImageVector
    get() {
        if (__10k != null) {
            return __10k!!
        }
        __10k = Builder(name = "_10k", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 10.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(10.5f)
                close()
                moveTo(21.0f, 3.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(18.0f)
                horizontalLineToRelative(18.0f)
                verticalLineTo(3.0f)
                close()
                moveTo(7.5f, 15.0f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(-4.5f)
                horizontalLineTo(4.5f)
                verticalLineTo(9.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(15.0f)
                close()
                moveTo(13.0f, 9.0f)
                verticalLineToRelative(6.0f)
                horizontalLineTo(8.5f)
                verticalLineTo(9.0f)
                horizontalLineTo(13.0f)
                close()
                moveTo(19.0f, 15.0f)
                horizontalLineToRelative(-1.75f)
                lineToRelative(-1.75f, -2.25f)
                verticalLineTo(15.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(9.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(2.25f)
                lineTo(17.25f, 9.0f)
                horizontalLineTo(19.0f)
                lineToRelative(-2.25f, 3.0f)
                lineTo(19.0f, 15.0f)
                close()
            }
        }
        .build()
        return __10k!!
    }

private var __10k: ImageVector? = null
