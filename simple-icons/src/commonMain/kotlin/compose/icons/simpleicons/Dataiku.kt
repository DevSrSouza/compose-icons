package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Dataiku: ImageVector
    get() {
        if (_dataiku != null) {
            return _dataiku!!
        }
        _dataiku = Builder(name = "Dataiku", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(18.527f, 15.34f)
                lineTo(12.5f, 15.34f)
                verticalLineToRelative(-0.934f)
                horizontalLineToRelative(6.026f)
                close()
                moveTo(17.788f, 6.61f)
                reflectiveCurveToRelative(-0.412f, 0.543f, -0.193f, 1.995f)
                curveToRelative(0.41f, 2.724f, -1.02f, 5.15f, -3.56f, 5.15f)
                horizontalLineToRelative(-1.87f)
                reflectiveCurveToRelative(-1.835f, -0.092f, -2.933f, 1.01f)
                curveToRelative(-3.263f, 3.269f, -4.04f, 4.116f, -4.274f, 4.233f)
                curveToRelative(-0.15f, 0.08f, -0.188f, -0.093f, -0.188f, -0.093f)
                lineToRelative(9.644f, -11.891f)
                curveToRelative(-0.203f, -2.145f, 2.34f, -2.715f, 3.278f, -1.13f)
                lineToRelative(0.884f, -0.248f)
                close()
                moveTo(16.189f, 5.996f)
                arcToRelative(0.476f, 0.476f, 0.0f, true, false, 0.47f, 0.474f)
                arcToRelative(0.476f, 0.476f, 0.0f, false, false, -0.47f, -0.474f)
                close()
            }
        }
        .build()
        return _dataiku!!
    }

private var _dataiku: ImageVector? = null
