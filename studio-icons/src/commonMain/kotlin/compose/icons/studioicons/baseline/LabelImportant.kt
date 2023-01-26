package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.LabelImportant: ImageVector
    get() {
        if (_labelImportant != null) {
            return _labelImportant!!
        }
        _labelImportant = Builder(name = "LabelImportant", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.5f, 18.99f)
                lineToRelative(11.0f, 0.01f)
                curveToRelative(0.67f, 0.0f, 1.27f, -0.33f, 1.63f, -0.84f)
                lineTo(20.5f, 12.0f)
                lineToRelative(-4.37f, -6.16f)
                curveToRelative(-0.36f, -0.51f, -0.96f, -0.84f, -1.63f, -0.84f)
                lineToRelative(-11.0f, 0.01f)
                lineTo(8.34f, 12.0f)
                lineTo(3.5f, 18.99f)
                close()
            }
        }
        .build()
        return _labelImportant!!
    }

private var _labelImportant: ImageVector? = null
