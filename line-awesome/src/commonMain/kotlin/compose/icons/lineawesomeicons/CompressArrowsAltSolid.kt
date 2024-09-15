package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.CompressArrowsAltSolid: ImageVector
    get() {
        if (_compressArrowsAltSolid != null) {
            return _compressArrowsAltSolid!!
        }
        _compressArrowsAltSolid = Builder(name = "CompressArrowsAltSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.719f, 3.281f)
                lineTo(3.281f, 4.719f)
                lineTo(10.563f, 12.0f)
                lineTo(5.0f, 12.0f)
                lineTo(5.0f, 14.0f)
                lineTo(14.0f, 14.0f)
                lineTo(14.0f, 5.0f)
                lineTo(12.0f, 5.0f)
                lineTo(12.0f, 10.563f)
                close()
                moveTo(27.281f, 3.281f)
                lineTo(20.0f, 10.563f)
                lineTo(20.0f, 5.0f)
                lineTo(18.0f, 5.0f)
                lineTo(18.0f, 14.0f)
                lineTo(27.0f, 14.0f)
                lineTo(27.0f, 12.0f)
                lineTo(21.438f, 12.0f)
                lineTo(28.719f, 4.719f)
                close()
                moveTo(5.0f, 18.0f)
                lineTo(5.0f, 20.0f)
                lineTo(10.563f, 20.0f)
                lineTo(3.281f, 27.281f)
                lineTo(4.719f, 28.719f)
                lineTo(12.0f, 21.438f)
                lineTo(12.0f, 27.0f)
                lineTo(14.0f, 27.0f)
                lineTo(14.0f, 18.0f)
                close()
                moveTo(18.0f, 18.0f)
                lineTo(18.0f, 27.0f)
                lineTo(20.0f, 27.0f)
                lineTo(20.0f, 21.438f)
                lineTo(27.281f, 28.719f)
                lineTo(28.719f, 27.281f)
                lineTo(21.438f, 20.0f)
                lineTo(27.0f, 20.0f)
                lineTo(27.0f, 18.0f)
                close()
            }
        }
        .build()
        return _compressArrowsAltSolid!!
    }

private var _compressArrowsAltSolid: ImageVector? = null
