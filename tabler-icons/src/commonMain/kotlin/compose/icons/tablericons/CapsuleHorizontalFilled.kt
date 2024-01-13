package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.CapsuleHorizontalFilled: ImageVector
    get() {
        if (_capsuleHorizontalFilled != null) {
            return _capsuleHorizontalFilled!!
        }
        _capsuleHorizontalFilled = Builder(name = "CapsuleHorizontalFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 5.0f)
                horizontalLineToRelative(-6.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, false, 0.0f, 14.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, 7.0f, -7.0f)
                lineToRelative(-0.007f, -0.303f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, -6.993f, -6.697f)
                close()
            }
        }
        .build()
        return _capsuleHorizontalFilled!!
    }

private var _capsuleHorizontalFilled: ImageVector? = null
