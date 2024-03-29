package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.PackageDependencies16: ImageVector
    get() {
        if (_packageDependencies16 != null) {
            return _packageDependencies16!!
        }
        _packageDependencies16 = Builder(name = "PackageDependencies16", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.122f, 0.392f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, 1.756f, 0.0f)
                lineToRelative(5.25f, 3.045f)
                curveToRelative(0.54f, 0.313f, 0.872f, 0.89f, 0.872f, 1.514f)
                lineTo(14.0f, 7.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                lineTo(12.5f, 5.677f)
                lineTo(7.75f, 8.432f)
                verticalLineToRelative(6.384f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.502f, 0.865f)
                lineTo(0.872f, 12.563f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 0.0f, 11.049f)
                lineTo(0.0f, 4.951f)
                curveToRelative(0.0f, -0.624f, 0.332f, -1.2f, 0.872f, -1.514f)
                lineTo(6.122f, 0.392f)
                close()
                moveTo(7.125f, 1.69f)
                lineToRelative(4.63f, 2.685f)
                lineTo(7.0f, 7.133f)
                lineTo(2.245f, 4.375f)
                lineToRelative(4.63f, -2.685f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.25f, 0.0f)
                close()
                moveTo(1.5f, 11.049f)
                lineTo(1.5f, 5.677f)
                lineToRelative(4.75f, 2.755f)
                verticalLineToRelative(5.516f)
                lineToRelative(-4.625f, -2.683f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.125f, -0.216f)
                close()
                moveTo(13.172f, 10.767f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.087f, -1.034f)
                lineToRelative(-2.378f, 2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.034f)
                lineToRelative(2.378f, 2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.087f, -1.034f)
                lineTo(11.999f, 13.5f)
                horizontalLineToRelative(3.251f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-3.251f)
                lineToRelative(1.173f, -1.233f)
                close()
            }
        }
        .build()
        return _packageDependencies16!!
    }

private var _packageDependencies16: ImageVector? = null
