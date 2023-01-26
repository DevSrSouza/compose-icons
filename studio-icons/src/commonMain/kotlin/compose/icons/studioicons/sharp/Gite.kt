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

public val SharpGroup.Gite: ImageVector
    get() {
        if (_gite != null) {
            return _gite!!
        }
        _gite = Builder(name = "Gite", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 6.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(6.0f)
                lineToRelative(-4.0f, 4.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(-9.0f)
                lineTo(18.0f, 6.0f)
                close()
                moveTo(4.0f, 12.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(5.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(12.0f)
                close()
                moveTo(20.0f, 17.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-6.17f)
                lineToRelative(2.0f, -2.0f)
                verticalLineToRelative(0.0f)
                lineToRelative(2.0f, 2.0f)
                verticalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _gite!!
    }

private var _gite: ImageVector? = null
