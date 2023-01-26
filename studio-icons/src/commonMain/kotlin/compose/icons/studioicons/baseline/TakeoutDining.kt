package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.TakeoutDining: ImageVector
    get() {
        if (_takeoutDining != null) {
            return _takeoutDining!!
        }
        _takeoutDining = Builder(name = "TakeoutDining", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.26f, 11.0f)
                horizontalLineToRelative(13.48f)
                lineToRelative(-0.67f, 9.0f)
                horizontalLineTo(5.93f)
                lineTo(5.26f, 11.0f)
                close()
                moveTo(9.02f, 4.0f)
                horizontalLineToRelative(5.95f)
                lineTo(19.0f, 7.38f)
                lineToRelative(1.59f, -1.59f)
                lineTo(22.0f, 7.21f)
                lineTo(19.21f, 10.0f)
                horizontalLineTo(4.79f)
                lineTo(2.0f, 7.21f)
                lineToRelative(1.41f, -1.41f)
                lineTo(5.0f, 7.38f)
                lineTo(9.02f, 4.0f)
                close()
            }
        }
        .build()
        return _takeoutDining!!
    }

private var _takeoutDining: ImageVector? = null
