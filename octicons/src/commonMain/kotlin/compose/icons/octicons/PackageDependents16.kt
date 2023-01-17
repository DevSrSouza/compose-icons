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

public val Octicons.PackageDependents16: ImageVector
    get() {
        if (_packageDependents16 != null) {
            return _packageDependents16!!
        }
        _packageDependents16 = Builder(name = "PackageDependents16", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
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
                close()
                moveTo(7.125f, 1.69f)
                arcToRelative(0.248f, 0.248f, 0.0f, false, false, -0.25f, 0.0f)
                lineToRelative(-4.63f, 2.685f)
                lineTo(7.0f, 7.133f)
                lineToRelative(4.755f, -2.758f)
                close()
                moveTo(1.5f, 11.049f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.125f, 0.216f)
                lineToRelative(4.625f, 2.683f)
                lineTo(6.25f, 8.432f)
                lineTo(1.5f, 5.677f)
                close()
                moveTo(12.328f, 14.733f)
                lineTo(13.501f, 13.5f)
                lineTo(10.25f, 13.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(3.251f)
                lineToRelative(-1.173f, -1.233f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 1.087f, -1.034f)
                lineToRelative(2.378f, 2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.034f)
                lineToRelative(-2.378f, 2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.087f, -1.034f)
                close()
            }
        }
        .build()
        return _packageDependents16!!
    }

private var _packageDependents16: ImageVector? = null
