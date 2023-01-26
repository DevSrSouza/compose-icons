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

public val SharpGroup.Drafts: ImageVector
    get() {
        if (_drafts != null) {
            return _drafts!!
        }
        _drafts = Builder(name = "Drafts", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.99f, 6.86f)
                lineTo(12.0f, 1.0f)
                lineTo(2.0f, 6.86f)
                verticalLineTo(20.0f)
                horizontalLineToRelative(20.0f)
                lineToRelative(-0.01f, -13.14f)
                close()
                moveTo(12.0f, 13.0f)
                lineTo(3.74f, 7.84f)
                lineTo(12.0f, 3.0f)
                lineToRelative(8.26f, 4.84f)
                lineTo(12.0f, 13.0f)
                close()
            }
        }
        .build()
        return _drafts!!
    }

private var _drafts: ImageVector? = null
