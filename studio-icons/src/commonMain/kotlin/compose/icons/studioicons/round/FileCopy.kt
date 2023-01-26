package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.FileCopy: ImageVector
    get() {
        if (_fileCopy != null) {
            return _fileCopy!!
        }
        _fileCopy = Builder(name = "FileCopy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 1.0f)
                lineTo(4.0f, 1.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f)
                lineTo(4.0f, 4.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(15.59f, 5.59f)
                lineToRelative(4.83f, 4.83f)
                curveToRelative(0.37f, 0.37f, 0.58f, 0.88f, 0.58f, 1.41f)
                lineTo(21.0f, 21.0f)
                curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f)
                lineTo(7.99f, 23.0f)
                curveTo(6.89f, 23.0f, 6.0f, 22.1f, 6.0f, 21.0f)
                lineToRelative(0.01f, -14.0f)
                curveToRelative(0.0f, -1.1f, 0.89f, -2.0f, 1.99f, -2.0f)
                horizontalLineToRelative(6.17f)
                curveToRelative(0.53f, 0.0f, 1.04f, 0.21f, 1.42f, 0.59f)
                close()
                moveTo(15.0f, 12.0f)
                horizontalLineToRelative(4.5f)
                lineTo(14.0f, 6.5f)
                lineTo(14.0f, 11.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _fileCopy!!
    }

private var _fileCopy: ImageVector? = null
