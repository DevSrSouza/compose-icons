package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.GenderNeuter: ImageVector
    get() {
        if (_genderNeuter != null) {
            return _genderNeuter!!
        }
        _genderNeuter = Builder(name = "GenderNeuter", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(212.0f, 104.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, true, false, -96.0f, 83.1f)
                lineTo(116.0f, 232.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(140.0f, 187.1f)
                arcTo(84.0f, 84.0f, 0.0f, false, false, 212.0f, 104.0f)
                close()
                moveTo(128.0f, 164.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, true, true, 60.0f, -60.0f)
                arcTo(60.0f, 60.0f, 0.0f, false, true, 128.0f, 164.0f)
                close()
            }
        }
        .build()
        return _genderNeuter!!
    }

private var _genderNeuter: ImageVector? = null
