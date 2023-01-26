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

public val RoundGroup.LabelImportant: ImageVector
    get() {
        if (_labelImportant != null) {
            return _labelImportant!!
        }
        _labelImportant = Builder(name = "LabelImportant", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.94f, 18.99f)
                horizontalLineTo(15.0f)
                curveToRelative(0.65f, 0.0f, 1.26f, -0.31f, 1.63f, -0.84f)
                lineToRelative(3.95f, -5.57f)
                curveToRelative(0.25f, -0.35f, 0.25f, -0.81f, 0.0f, -1.16f)
                lineToRelative(-3.96f, -5.58f)
                curveTo(16.26f, 5.31f, 15.65f, 5.0f, 15.0f, 5.0f)
                horizontalLineTo(5.94f)
                curveToRelative(-0.81f, 0.0f, -1.28f, 0.93f, -0.81f, 1.59f)
                lineTo(9.0f, 12.0f)
                lineToRelative(-3.87f, 5.41f)
                curveToRelative(-0.47f, 0.66f, 0.0f, 1.58f, 0.81f, 1.58f)
                close()
            }
        }
        .build()
        return _labelImportant!!
    }

private var _labelImportant: ImageVector? = null
