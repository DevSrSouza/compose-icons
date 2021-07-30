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

public val LineAwesomeIcons.UploadSolid: ImageVector
    get() {
        if (_uploadSolid != null) {
            return _uploadSolid!!
        }
        _uploadSolid = Builder(name = "UploadSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.5938f)
                lineTo(15.2813f, 4.2813f)
                lineTo(8.2813f, 11.2813f)
                lineTo(9.7188f, 12.7188f)
                lineTo(15.0f, 7.4375f)
                lineTo(15.0f, 24.0f)
                lineTo(17.0f, 24.0f)
                lineTo(17.0f, 7.4375f)
                lineTo(22.2813f, 12.7188f)
                lineTo(23.7188f, 11.2813f)
                lineTo(16.7188f, 4.2813f)
                close()
                moveTo(7.0f, 26.0f)
                lineTo(7.0f, 28.0f)
                lineTo(25.0f, 28.0f)
                lineTo(25.0f, 26.0f)
                close()
            }
        }
        .build()
        return _uploadSolid!!
    }

private var _uploadSolid: ImageVector? = null
