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

public val SharpGroup.LocalPostOffice: ImageVector
    get() {
        if (_localPostOffice != null) {
            return _localPostOffice!!
        }
        _localPostOffice = Builder(name = "LocalPostOffice", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 4.0f)
                lineTo(2.01f, 4.0f)
                verticalLineToRelative(16.0f)
                lineTo(22.0f, 20.0f)
                lineTo(22.0f, 4.0f)
                close()
                moveTo(20.0f, 8.0f)
                lineToRelative(-8.0f, 5.0f)
                lineToRelative(-8.0f, -5.0f)
                lineTo(4.0f, 6.0f)
                lineToRelative(8.0f, 5.0f)
                lineToRelative(8.0f, -5.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _localPostOffice!!
    }

private var _localPostOffice: ImageVector? = null
