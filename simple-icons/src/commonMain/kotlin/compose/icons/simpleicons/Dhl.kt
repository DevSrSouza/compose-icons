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

public val SimpleIcons.Dhl: ImageVector
    get() {
        if (_dhl != null) {
            return _dhl!!
        }
        _dhl = Builder(name = "Dhl", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.22f, 10.303f)
                lineToRelative(-0.767f, 1.043f)
                horizontalLineToRelative(4.18f)
                curveToRelative(0.21f, 0.0f, 0.208f, 0.078f, 0.105f, 0.218f)
                curveToRelative(-0.105f, 0.142f, -0.28f, 0.39f, -0.386f, 0.534f)
                curveToRelative(-0.054f, 0.073f, -0.154f, 0.207f, 0.171f, 0.207f)
                horizontalLineToRelative(1.71f)
                lineToRelative(0.505f, -0.69f)
                curveToRelative(0.314f, -0.426f, 0.028f, -1.312f, -1.095f, -1.312f)
                lineTo(4.22f, 10.303f)
                close()
                moveTo(11.424f, 10.303f)
                lineToRelative(-1.475f, 2.002f)
                horizontalLineToRelative(5.39f)
                lineToRelative(1.473f, -2.002f)
                lineTo(14.61f, 10.303f)
                lineToRelative(-0.843f, 1.146f)
                horizontalLineToRelative(-0.985f)
                lineToRelative(0.846f, -1.146f)
                horizontalLineToRelative(-2.203f)
                close()
                moveTo(17.529f, 10.303f)
                lineToRelative(-1.474f, 2.002f)
                horizontalLineToRelative(2.334f)
                lineToRelative(1.472f, -2.002f)
                lineTo(17.53f, 10.303f)
                close()
                moveTo(4.684f, 11.603f)
                lineToRelative(-1.54f, 2.094f)
                horizontalLineToRelative(3.754f)
                curveToRelative(1.24f, 0.0f, 1.932f, -0.844f, 2.145f, -1.136f)
                horizontalLineToRelative(-2.56f)
                curveToRelative(-0.326f, 0.0f, -0.226f, -0.133f, -0.172f, -0.207f)
                curveToRelative(0.107f, -0.143f, 0.283f, -0.388f, 0.388f, -0.53f)
                curveToRelative(0.104f, -0.14f, 0.107f, -0.22f, -0.105f, -0.22f)
                horizontalLineToRelative(-1.91f)
                close()
                moveTo(0.0f, 12.562f)
                verticalLineToRelative(0.242f)
                horizontalLineToRelative(3.398f)
                lineToRelative(0.176f, -0.242f)
                lineTo(0.0f, 12.562f)
                close()
                moveTo(9.762f, 12.562f)
                lineToRelative(-0.836f, 1.136f)
                horizontalLineToRelative(2.203f)
                lineToRelative(0.836f, -1.136f)
                lineTo(9.762f, 12.562f)
                close()
                moveTo(12.947f, 12.562f)
                lineToRelative(-0.836f, 1.136f)
                horizontalLineToRelative(2.203f)
                lineToRelative(0.836f, -1.136f)
                horizontalLineToRelative(-2.203f)
                close()
                moveTo(15.865f, 12.562f)
                reflectiveCurveToRelative(-0.159f, 0.22f, -0.238f, 0.326f)
                curveToRelative(-0.276f, 0.374f, -0.033f, 0.81f, 0.87f, 0.81f)
                horizontalLineToRelative(3.538f)
                lineToRelative(0.834f, -1.136f)
                horizontalLineToRelative(-5.004f)
                close()
                moveTo(21.273f, 12.562f)
                lineToRelative(-0.177f, 0.242f)
                lineTo(24.0f, 12.804f)
                verticalLineToRelative(-0.242f)
                horizontalLineToRelative(-2.727f)
                close()
                moveTo(0.0f, 13.01f)
                verticalLineToRelative(0.24f)
                horizontalLineToRelative(3.068f)
                lineToRelative(0.178f, -0.24f)
                lineTo(0.0f, 13.01f)
                close()
                moveTo(20.943f, 13.01f)
                lineToRelative(-0.175f, 0.24f)
                lineTo(24.0f, 13.25f)
                verticalLineToRelative(-0.24f)
                horizontalLineToRelative(-3.057f)
                close()
                moveTo(0.0f, 13.457f)
                verticalLineToRelative(0.24f)
                horizontalLineToRelative(2.74f)
                lineToRelative(0.176f, -0.24f)
                lineTo(0.0f, 13.457f)
                close()
                moveTo(20.615f, 13.457f)
                lineToRelative(-0.177f, 0.24f)
                lineTo(24.0f, 13.697f)
                verticalLineToRelative(-0.24f)
                horizontalLineToRelative(-3.385f)
                close()
            }
        }
        .build()
        return _dhl!!
    }

private var _dhl: ImageVector? = null
