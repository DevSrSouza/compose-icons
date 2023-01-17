package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Milestone24: ImageVector
    get() {
        if (_milestone24 != null) {
            return _milestone24!!
        }
        _milestone24 = Builder(name = "Milestone24", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.75f, 1.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, 0.75f)
                lineTo(12.5f, 4.0f)
                horizontalLineToRelative(6.532f)
                curveToRelative(0.42f, 0.0f, 0.826f, 0.15f, 1.143f, 0.425f)
                lineToRelative(3.187f, 2.75f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, 0.0f, 2.65f)
                lineToRelative(-3.187f, 2.75f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, -1.143f, 0.425f)
                lineTo(12.5f, 13.0f)
                verticalLineToRelative(9.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                lineTo(11.0f, 13.0f)
                lineTo(3.75f, 13.0f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 2.0f, 11.25f)
                verticalLineToRelative(-5.5f)
                curveTo(2.0f, 4.783f, 2.784f, 4.0f, 3.75f, 4.0f)
                lineTo(11.0f, 4.0f)
                lineTo(11.0f, 1.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, -0.75f)
                close()
                moveTo(19.032f, 5.5f)
                lineTo(3.75f, 5.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                verticalLineToRelative(5.5f)
                curveToRelative(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(15.282f)
                curveToRelative(0.06f, 0.0f, 0.118f, -0.021f, 0.163f, -0.06f)
                lineToRelative(3.188f, -2.75f)
                arcToRelative(0.248f, 0.248f, 0.0f, false, false, 0.0f, -0.38f)
                lineToRelative(-3.188f, -2.75f)
                arcToRelative(0.249f, 0.249f, 0.0f, false, false, -0.163f, -0.06f)
                close()
            }
        }
        .build()
        return _milestone24!!
    }

private var _milestone24: ImageVector? = null
