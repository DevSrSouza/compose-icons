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

public val SharpGroup.ExposurePlus1: ImageVector
    get() {
        if (_exposurePlus1 != null) {
            return _exposurePlus1!!
        }
        _exposurePlus1 = Builder(name = "ExposurePlus1", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 7.0f)
                lineTo(8.0f, 7.0f)
                verticalLineToRelative(4.0f)
                lineTo(4.0f, 11.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(10.0f, 7.0f)
                close()
                moveTo(20.0f, 18.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(18.0f, 7.38f)
                lineTo(15.0f, 8.4f)
                lineTo(15.0f, 6.7f)
                lineTo(19.7f, 5.0f)
                horizontalLineToRelative(0.3f)
                verticalLineToRelative(13.0f)
                close()
            }
        }
        .build()
        return _exposurePlus1!!
    }

private var _exposurePlus1: ImageVector? = null
