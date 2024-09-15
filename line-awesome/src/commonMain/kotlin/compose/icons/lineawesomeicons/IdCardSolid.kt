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

public val LineAwesomeIcons.IdCardSolid: ImageVector
    get() {
        if (_idCardSolid != null) {
            return _idCardSolid!!
        }
        _idCardSolid = Builder(name = "IdCardSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 6.0f)
                curveTo(3.355f, 6.0f, 2.0f, 7.355f, 2.0f, 9.0f)
                lineTo(2.0f, 23.0f)
                curveTo(2.0f, 24.645f, 3.355f, 26.0f, 5.0f, 26.0f)
                lineTo(27.0f, 26.0f)
                curveTo(28.645f, 26.0f, 30.0f, 24.645f, 30.0f, 23.0f)
                lineTo(30.0f, 9.0f)
                curveTo(30.0f, 7.355f, 28.645f, 6.0f, 27.0f, 6.0f)
                close()
                moveTo(5.0f, 8.0f)
                lineTo(27.0f, 8.0f)
                curveTo(27.566f, 8.0f, 28.0f, 8.434f, 28.0f, 9.0f)
                lineTo(28.0f, 23.0f)
                curveTo(28.0f, 23.566f, 27.566f, 24.0f, 27.0f, 24.0f)
                lineTo(5.0f, 24.0f)
                curveTo(4.434f, 24.0f, 4.0f, 23.566f, 4.0f, 23.0f)
                lineTo(4.0f, 9.0f)
                curveTo(4.0f, 8.434f, 4.434f, 8.0f, 5.0f, 8.0f)
                close()
                moveTo(11.0f, 10.0f)
                curveTo(8.801f, 10.0f, 7.0f, 11.801f, 7.0f, 14.0f)
                curveTo(7.0f, 15.113f, 7.477f, 16.117f, 8.219f, 16.844f)
                curveTo(6.887f, 17.746f, 6.0f, 19.281f, 6.0f, 21.0f)
                lineTo(8.0f, 21.0f)
                curveTo(8.0f, 19.332f, 9.332f, 18.0f, 11.0f, 18.0f)
                curveTo(12.668f, 18.0f, 14.0f, 19.332f, 14.0f, 21.0f)
                lineTo(16.0f, 21.0f)
                curveTo(16.0f, 19.281f, 15.113f, 17.746f, 13.781f, 16.844f)
                curveTo(14.523f, 16.117f, 15.0f, 15.113f, 15.0f, 14.0f)
                curveTo(15.0f, 11.801f, 13.199f, 10.0f, 11.0f, 10.0f)
                close()
                moveTo(18.0f, 11.0f)
                lineTo(18.0f, 13.0f)
                lineTo(26.0f, 13.0f)
                lineTo(26.0f, 11.0f)
                close()
                moveTo(11.0f, 12.0f)
                curveTo(12.117f, 12.0f, 13.0f, 12.883f, 13.0f, 14.0f)
                curveTo(13.0f, 15.117f, 12.117f, 16.0f, 11.0f, 16.0f)
                curveTo(9.883f, 16.0f, 9.0f, 15.117f, 9.0f, 14.0f)
                curveTo(9.0f, 12.883f, 9.883f, 12.0f, 11.0f, 12.0f)
                close()
                moveTo(18.0f, 15.0f)
                lineTo(18.0f, 17.0f)
                lineTo(26.0f, 17.0f)
                lineTo(26.0f, 15.0f)
                close()
                moveTo(18.0f, 19.0f)
                lineTo(18.0f, 21.0f)
                lineTo(23.0f, 21.0f)
                lineTo(23.0f, 19.0f)
                close()
            }
        }
        .build()
        return _idCardSolid!!
    }

private var _idCardSolid: ImageVector? = null
