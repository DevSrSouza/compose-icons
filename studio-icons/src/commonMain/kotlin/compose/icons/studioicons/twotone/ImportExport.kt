package compose.icons.studioicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.ImportExport: ImageVector
    get() {
        if (_importExport != null) {
            return _importExport!!
        }
        _importExport = Builder(name = "ImportExport", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 6.99f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(14.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(6.99f)
                horizontalLineToRelative(3.0f)
                lineTo(9.0f, 3.0f)
                close()
                moveTo(14.0f, 10.0f)
                verticalLineToRelative(7.01f)
                horizontalLineToRelative(-3.0f)
                lineTo(15.0f, 21.0f)
                lineToRelative(4.0f, -3.99f)
                horizontalLineToRelative(-3.0f)
                verticalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _importExport!!
    }

private var _importExport: ImageVector? = null
