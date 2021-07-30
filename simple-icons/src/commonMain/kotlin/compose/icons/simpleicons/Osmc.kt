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

public val SimpleIcons.Osmc: ImageVector
    get() {
        if (_osmc != null) {
            return _osmc!!
        }
        _osmc = Builder(name = "Osmc", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.768f, 12.002f)
                curveToRelative(0.0f, 5.935f, -4.829f, 10.768f, -10.768f, 10.768f)
                curveToRelative(-5.935f, -0.005f, -10.763f, -4.833f, -10.763f, -10.768f)
                curveToRelative(0.0f, -5.94f, 4.828f, -10.767f, 10.768f, -10.767f)
                curveToRelative(5.934f, 0.0f, 10.763f, 4.828f, 10.763f, 10.767f)
                moveToRelative(0.292f, -4.673f)
                arcToRelative(11.913f, 11.913f, 0.0f, false, false, -2.57f, -3.813f)
                arcToRelative(11.963f, 11.963f, 0.0f, false, false, -3.813f, -2.57f)
                arcTo(11.857f, 11.857f, 0.0f, false, false, 12.005f, 0.0f)
                arcToRelative(11.926f, 11.926f, 0.0f, false, false, -8.486f, 3.516f)
                arcTo(11.963f, 11.963f, 0.0f, false, false, 0.948f, 7.33f)
                curveTo(0.318f, 8.811f, 0.002f, 10.38f, 0.002f, 12.002f)
                reflectiveCurveToRelative(0.316f, 3.192f, 0.942f, 4.673f)
                arcToRelative(11.913f, 11.913f, 0.0f, false, false, 2.57f, 3.813f)
                arcTo(11.963f, 11.963f, 0.0f, false, false, 12.0f, 24.0f)
                curveToRelative(1.619f, 0.0f, 3.191f, -0.32f, 4.673f, -0.942f)
                arcToRelative(11.913f, 11.913f, 0.0f, false, false, 3.813f, -2.57f)
                arcToRelative(11.963f, 11.963f, 0.0f, false, false, 3.512f, -8.486f)
                curveToRelative(0.0f, -1.623f, -0.311f, -3.191f, -0.938f, -4.673f)
                moveTo(8.566f, 14.631f)
                verticalLineTo(9.263f)
                lineToRelative(2.574f, 2.684f)
                lineToRelative(-2.574f, 2.684f)
                close()
                moveTo(7.327f, 6.296f)
                verticalLineToRelative(11.422f)
                lineToRelative(8.116f, -8.455f)
                verticalLineToRelative(6.767f)
                curveToRelative(0.0f, 0.343f, 0.279f, 0.618f, 0.617f, 0.618f)
                arcToRelative(0.622f, 0.622f, 0.0f, false, false, 0.622f, -0.622f)
                verticalLineToRelative(-9.74f)
                lineToRelative(-4.677f, 4.77f)
                lineToRelative(-4.678f, -4.76f)
                close()
            }
        }
        .build()
        return _osmc!!
    }

private var _osmc: ImageVector? = null
