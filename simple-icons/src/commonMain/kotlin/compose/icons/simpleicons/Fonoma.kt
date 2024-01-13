package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Fonoma: ImageVector
    get() {
        if (_fonoma != null) {
            return _fonoma!!
        }
        _fonoma = Builder(name = "Fonoma", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.706f, 21.919f)
                arcToRelative(4.295f, 4.295f, 0.0f, false, false, 4.293f, -4.296f)
                arcToRelative(4.295f, 4.295f, 0.0f, true, false, -4.293f, 4.296f)
                close()
                moveTo(4.296f, 10.672f)
                arcToRelative(4.295f, 4.295f, 0.0f, false, false, 4.293f, -4.295f)
                arcToRelative(4.295f, 4.295f, 0.0f, true, false, -4.294f, 4.295f)
                close()
                moveTo(14.708f, 10.672f)
                horizontalLineToRelative(4.975f)
                arcToRelative(4.277f, 4.277f, 0.0f, false, false, 4.293f, -4.295f)
                arcToRelative(4.277f, 4.277f, 0.0f, false, false, -4.293f, -4.296f)
                horizontalLineToRelative(-4.975f)
                arcToRelative(4.277f, 4.277f, 0.0f, false, false, -4.294f, 4.296f)
                arcToRelative(4.277f, 4.277f, 0.0f, false, false, 4.294f, 4.295f)
                close()
                moveTo(4.295f, 21.92f)
                horizontalLineToRelative(4.976f)
                arcToRelative(4.277f, 4.277f, 0.0f, false, false, 4.293f, -4.296f)
                arcToRelative(4.277f, 4.277f, 0.0f, false, false, -4.293f, -4.295f)
                lineTo(4.295f, 13.329f)
                arcToRelative(4.277f, 4.277f, 0.0f, false, false, -4.293f, 4.295f)
                curveToRelative(0.068f, 2.318f, 1.976f, 4.296f, 4.293f, 4.296f)
                close()
            }
        }
        .build()
        return _fonoma!!
    }

private var _fonoma: ImageVector? = null
