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

public val SharpGroup.FiberNew: ImageVector
    get() {
        if (_fiberNew != null) {
            return _fiberNew!!
        }
        _fiberNew = Builder(name = "FiberNew", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 4.0f)
                lineTo(2.0f, 4.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(20.0f)
                lineTo(22.0f, 4.0f)
                close()
                moveTo(8.5f, 15.0f)
                lineTo(7.3f, 15.0f)
                lineToRelative(-2.55f, -3.5f)
                lineTo(4.75f, 15.0f)
                lineTo(3.5f, 15.0f)
                lineTo(3.5f, 9.0f)
                horizontalLineToRelative(1.25f)
                lineToRelative(2.5f, 3.5f)
                lineTo(7.25f, 9.0f)
                lineTo(8.5f, 9.0f)
                verticalLineToRelative(6.0f)
                close()
                moveTo(13.5f, 10.26f)
                lineTo(11.0f, 10.26f)
                verticalLineToRelative(1.12f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(1.26f)
                lineTo(11.0f, 12.64f)
                verticalLineToRelative(1.11f)
                horizontalLineToRelative(2.5f)
                lineTo(13.5f, 15.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(9.5f, 9.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(1.26f)
                close()
                moveTo(20.5f, 15.0f)
                horizontalLineToRelative(-6.0f)
                lineTo(14.5f, 9.0f)
                horizontalLineToRelative(1.25f)
                verticalLineToRelative(4.51f)
                horizontalLineToRelative(1.13f)
                lineTo(16.88f, 9.99f)
                horizontalLineToRelative(1.25f)
                verticalLineToRelative(3.51f)
                horizontalLineToRelative(1.12f)
                lineTo(19.25f, 9.0f)
                horizontalLineToRelative(1.25f)
                verticalLineToRelative(6.0f)
                close()
            }
        }
        .build()
        return _fiberNew!!
    }

private var _fiberNew: ImageVector? = null
