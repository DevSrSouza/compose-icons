package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.SubdirectoryArrowRight: ImageVector
    get() {
        if (_subdirectoryArrowRight != null) {
            return _subdirectoryArrowRight!!
        }
        _subdirectoryArrowRight = Builder(name = "SubdirectoryArrowRight", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 15.0f)
                lineToRelative(-6.0f, 6.0f)
                lineToRelative(-1.42f, -1.42f)
                lineTo(15.17f, 16.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(9.17f)
                lineToRelative(-3.59f, -3.58f)
                lineTo(13.0f, 9.0f)
                lineToRelative(6.0f, 6.0f)
                close()
            }
        }
        .build()
        return _subdirectoryArrowRight!!
    }

private var _subdirectoryArrowRight: ImageVector? = null
