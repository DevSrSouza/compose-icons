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

public val LineAwesomeIcons.RemoveFormatSolid: ImageVector
    get() {
        if (_removeFormatSolid != null) {
            return _removeFormatSolid!!
        }
        _removeFormatSolid = Builder(name = "RemoveFormatSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.289f, 5.973f)
                lineTo(3.084f, 7.57f)
                lineTo(27.777f, 26.178f)
                lineTo(28.98f, 24.58f)
                lineTo(18.027f, 16.326f)
                lineTo(20.285f, 10.0f)
                lineTo(25.0f, 10.0f)
                lineTo(25.0f, 11.5f)
                curveTo(25.0f, 11.776f, 25.224f, 12.0f, 25.5f, 12.0f)
                lineTo(26.5f, 12.0f)
                curveTo(26.776f, 12.0f, 27.0f, 11.776f, 27.0f, 11.5f)
                lineTo(27.0f, 7.5f)
                curveTo(27.0f, 7.224f, 26.776f, 7.0f, 26.5f, 7.0f)
                lineTo(10.5f, 7.0f)
                curveTo(10.224f, 7.0f, 10.0f, 7.224f, 10.0f, 7.5f)
                lineTo(10.0f, 10.277f)
                lineTo(4.289f, 5.973f)
                close()
                moveTo(12.0f, 10.0f)
                lineTo(17.285f, 10.0f)
                lineTo(15.662f, 14.545f)
                lineTo(11.934f, 11.734f)
                curveTo(11.972f, 11.664f, 12.0f, 11.586f, 12.0f, 11.5f)
                lineTo(12.0f, 10.0f)
                close()
                moveTo(14.254f, 18.49f)
                lineTo(13.0f, 22.0f)
                lineTo(11.5f, 22.0f)
                curveTo(11.224f, 22.0f, 11.0f, 22.224f, 11.0f, 22.5f)
                lineTo(11.0f, 24.5f)
                curveTo(11.0f, 24.776f, 11.224f, 25.0f, 11.5f, 25.0f)
                lineTo(16.5f, 25.0f)
                curveTo(16.776f, 25.0f, 17.0f, 24.776f, 17.0f, 24.5f)
                lineTo(17.0f, 22.5f)
                curveTo(17.0f, 22.224f, 16.776f, 22.0f, 16.5f, 22.0f)
                lineTo(16.0f, 22.0f)
                lineTo(16.619f, 20.266f)
                lineTo(14.254f, 18.49f)
                close()
            }
        }
        .build()
        return _removeFormatSolid!!
    }

private var _removeFormatSolid: ImageVector? = null
